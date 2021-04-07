package com.compil;

import gen.TinyLanguageSIIBaseListener;
import gen.TinyLanguageSIIParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Cette classe sert à verifier les erreurs sémantiques
 * Verifier les double déclarations, les types et leur compatibilité
 * Insérer toutes les variables dans la TS
 **/

public class routinesTS extends TinyLanguageSIIBaseListener {

    private static final int INT = 1;
    private static final int FLOAT = 2;
    private static final int STRING = 3;

    private static final int DECLARED = 1;
    private static final int UNDECLARED = 0;

    private static final String ERR_NO_DEC =" variable non declared : ";
    private static final String ERR_DIV_Z =" numeric overflow : ";
    private static final String ERR_DOUBLE_DEC =" double declaration : ";
    private static final String ERR_INCOMPATIBILITY =" type mismatch : ";

    // Une hash map (liste avec des clés et des valeurs) pour stocker le type de chaque expression
    private HashMap<ParserRuleContext, Integer> types = new HashMap<>();
    private ArrayList<String> errors = new ArrayList<>();
    private TableSymbole table = new TableSymbole();

    public routinesTS(ArrayList<String> errors) {
        this.errors = errors;
    }

    public TableSymbole getTable() {
        return table;
    }

    @Override
    public void enterProgramme(TinyLanguageSIIParser.ProgrammeContext ctx){
        System.out.println("Program rule entered");
        types = new HashMap<ParserRuleContext, Integer>();
    }

    @Override
    public void exitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx){
        if (errors.size() == 0) {
            System.out.println("No semantic errors found !");
            clearMap();
            table.display();
        }
        else
        {
            System.out.println("Program compiled with the following errors :");
            for (String error : errors) System.out.println("\t"+error);
        }
    }

    //Vérifier les types et les double déclarations
    @Override
    public void exitDeclarations(TinyLanguageSIIParser.DeclarationsContext ctx) {
        int type;

        //TODO : Une declaration null est détectée avant le début des déclarations !!
        if (ctx.type()!=null)
        {
            if (ctx.type().getText().equals("intCompil"))
                type = INT;
            else if (ctx.type().getText().equals("floatCompil"))
                type = FLOAT;
            else
                type = STRING;

            TinyLanguageSIIParser.IdsContext idVariables = ctx.ids();
            for (int i=0; i<idVariables.ID().size(); i++)
            {
                String nomVariable = idVariables.ID(i).getText();
                if(table.contains(nomVariable)) { // Ajouter une erreur à la liste d'erreurs
                    errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ERR_DOUBLE_DEC + nomVariable );
                }
                else //ajouter l'element à la table
                    table.add(new TableSymbole.row(nomVariable, DECLARED, type));
//            if (idVariables.ID() == null)
//                return;
            }
        }
    }

    // Vérifier les types des expression
    @Override
    public void exitExp(TinyLanguageSIIParser.ExpContext ctx) {
        //TODO : je crois qu'on derais vérifier ctx.exp(0) aussi
        /** si l'expression est une opération arithmétique
         | exp (MUL|DIV) exp
         | exp (PLUS|MOINS) exp
         * on verifie la compatibilité des types d'expressions
         */

        try {
            if (ctx.exp()!=null) {
                if (ctx.exp().size() > 1) { // Dans le cas exp op exp verifier que les 2 expression ont été déclarées si elles sont des ID
                    boolean dec1=true, dec2=true;
                    if (ctx.exp(0).ID()!= null){
                        dec1 = table.contains(ctx.exp(0).ID().toString());
                        if(!dec1){
                            errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ ctx.exp(0).ID().toString());
                        }
                    }
                    if (ctx.exp(1).ID()!= null) {
                        dec2 = table.contains(ctx.exp(1).ID().toString());
                        if (!dec2) {
                            errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ ctx.exp(1).ID().toString());
                        }
                    }

                    // Si c'est un division virifier que le deuxième opérateur est différent de 0
                    if (ctx.opMD()!=null && ctx.opMD().getText().equals("/") && ctx.exp(1).getText().equals("0")){
                        addCtxType(ctx, 0);
                        errors.add("Semantic error at line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + ERR_DIV_Z + ctx.getText());
                    }

                    //Si ce ne sont pas des identificateurs alors dec1 et dec2 auront la valeur initiale
                    if (dec1 && dec2 && compatibles(getCtxType(ctx.exp(0)), getCtxType(ctx.exp(1)))) {
                            addCtxType(ctx, typeResultat(getCtxType(ctx.exp(0)), getCtxType(ctx.exp(1))));
                    }else {
                        addCtxType(ctx, 0);
                        errors.add("Semantic error at line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + ERR_INCOMPATIBILITY + ctx.getText());
                    }
                } else  if(ctx.INTEGER() != null)
                    addCtxType(ctx, INT);

                else if(ctx.FLOAT() != null)
                    addCtxType(ctx, FLOAT);

                else if (table.contains(ctx.ID().getText())) //C'est forcément un ID donc on vérifie s'il est déclaré puis on le trouve dans la ts et on donne son type à l'exp
                    addCtxType(ctx, table.getRowByName(ctx.ID().getText()).type);

                else if (!table.contains(ctx.ID().getText())) //id non déclaré
                    errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+  ctx.getText());
            }
        }
        catch (Exception e){
            if (ctx.exp().size() > 1) {
                System.out.println(ctx.exp(1).getText()+" | "+ctx.exp(0).getText()+" line "+e.getStackTrace()[0].getLineNumber()+" error: "+e.toString());
            }
            else if (ctx.exp()!=null)
                System.out.println(ctx.getText()+" line "+e.getStackTrace()[0].getLineNumber()+" error: "+e.toString());
            else System.out.println(""+ctx.exp().toString());
        }
    }

    // Gérer les affectations
    @Override
    public void exitAffectation(TinyLanguageSIIParser.AffectationContext ctx) {
        if (table.contains(ctx.ID().getText()))
        {
            int type1 = table.getRowByName(ctx.ID().getText()).type;
            int type2 = 0;

//            System.out.println("------------------------");
//            System.out.println(ctx.exp().getText());

            if (ctx.STRING() != null)
                type2 = 3;
            if (ctx.exp() != null)
                type2 = getCtxType(ctx.exp());

            if(!compatibles(type1, type2))
                errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_INCOMPATIBILITY+ctx.ID().getText() );
        }
        else
            errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ctx.ID().getText() );
    }

    @Override
    public void exitEcrire(TinyLanguageSIIParser.EcrireContext ctx) { // TODO : A revérifier
        //verifier si les variables sont déclarées
        if (ctx.getChild(2).getChildCount()>1){
            for (int i=0; i<ctx.getChild(2).getChildCount(); i++)
                if (!ctx.ids().children.get(i).getText().equals(",") && !table.contains(ctx.ids().children.get(i).getText()))
                    errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ctx.ids().children.get(i).getText() ); }
        else{
            if (!table.contains(ctx.getChild(2).getText()))
                errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ERR_NO_DEC + ctx.getChild(2).getText());
        }

    }

    @Override
    public void exitLire(TinyLanguageSIIParser.LireContext ctx) {// TODO : A revérifier
        //verifier si les variables sont déclarées
        for (int i=0; i<ctx.ids().getChildCount(); i++)
            if (!ctx.ids().children.get(i).getText().equals(",") && !table.contains(ctx.ids().children.get(i).getText()))
                errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ERR_NO_DEC + ctx.ids().children.get(i).getText());
    }

    // Méthodes  pour gérer les types des expressions
    private void addCtxType(ParserRuleContext ctx, int type)
    {
        types.put(ctx,type);
    }

    private int getCtxType(ParserRuleContext ctx) { return types.get(ctx); }

    private void clearMap()
    {
        types.clear();
    }

    private static boolean compatibles (int type1, int type2)
    {
        // on peut affecter entier à entier ou float
        // on peut affecter un float à un float seulement
        // on ne peut affecter float ou un entier à string ni l'inverse

        /*int 1
        float 2
        string 3*/

        if (type1==FLOAT)
            return type2!=STRING; //type2!=3
        else return type2 == type1; // int = int ou string = string
    }

    private static int typeResultat (int t1, int t2)
    {
        if (t1 == t2)
            return t1;
        else if((t1 == INT && t2 == FLOAT )|| (t1 == FLOAT && t2 == INT ))
            return FLOAT;
        else return -1; //error
    }
}
