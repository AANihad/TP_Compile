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

    private static final String ERR_NO_DEC =" variable non declared : ";
    private static final String ERR_DIV_Z =" numeric overflow : ";
    private static final String ERR_DOUBLE_DEC =" double declaration : ";
    private static final String ERR_INCOMPATIBILITY =" type mismatch : ";
    private static final String ERR_INSTANTIOATION =" variable non instatiated : ";

    // Une hash map (liste avec des clés et des valeurs) pour stocker le type de chaque expression
    private HashMap<ParserRuleContext, Integer> types = new HashMap<>();
    private HashMap<ParserRuleContext, String> valeurs = new HashMap<>();
    private HashMap<ParserRuleContext, elementValue> typeVal = new HashMap<>();

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
    }

    @Override
    public void exitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx){
        if (errors.size() == 0) {
            System.out.println("No semantic errors found !");
            clearMaps();
//            table.display();
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
                else { //ajouter l'element à la table
                    table.add(new TableSymbole.row(nomVariable, DECLARED, type)); // Les ids sont automatquement insérés en tant que non instanciés
                    System.out.println(type+"ylyl");
                }
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
                String resultat="0";
                String droite = "0", gauche = "";
                if (ctx.exp().size() > 1 && ctx.parG()==null) { // Dans le cas exp op exp verifier que les 2 expression ont été déclarées si elles sont des ID

                    boolean dec1=true, dec2=true, init1 = false, init2=false;
                    if (ctx.exp(0).ID()!= null){        //L'expression de gauche est un id
                        dec1 = table.contains(ctx.exp(0).ID().toString());
                        if(!dec1){                      //L'id n'a pas été déclaré
                            errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ ctx.exp(0).ID().toString());
                        }else {                         //L'id a été déclaré
                            init1 = table.getRowByName(ctx.exp(0).getText()).isInit();
                            if (!init1)                 //L'id n'a pas été initialisé
                                errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_INSTANTIOATION+ ctx.exp(0).ID().toString());
                            else{
                                //C'est un id déclaré et initialisé
                                gauche = table.getRowByName(ctx.exp(0).getText()).getValue();
                            }
                        }
                    }
                    else { // Ce n'est pas un id, trouver la valeur
                        gauche = valeurs.get(ctx.exp(0));
                    }

                    // Même chose pour l'expression de droite
                    if (ctx.exp(1).ID()!= null) {           //L'expression de droite est un id
                        dec2 = table.contains(ctx.exp(1).ID().toString());
                        if (!dec2) {                        //L'id n'a pas été déclaré
                            errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ ctx.exp(1).ID().toString());
                        } else {                            //L'id a été déclaré
                            init2 = table.getRowByName(ctx.exp(1).getText()).isInit();
                            if (!init2)                     //L'id n'a pas été initialisé
                                errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_INSTANTIOATION+ ctx.exp(1).ID().toString());
                            else{
                                //C'est un id déclaré et initialisé
                                droite = table.getRowByName(ctx.exp(1).getText()).getValue();
                            }
                        }
                    }
                    else { // Ce n'est pas un id, trouver la valeur
                        droite = valeurs.get(ctx.exp(1));
                    }


                    // Si c'est un division virifier que le deuxième opérateur est différent de 0
//                    if (ctx.opMD()!=null && ctx.opMD().getText().equals("/") && (ctx.exp(1).getText().equals("0"))||droite!=null && droite.equals("0")){
                    if (ctx.opMD()!=null && ctx.opMD().getText().equals("/") && (ctx.exp(1).getText().equals("0"))||ctx.exp(1)!=null && ctx.exp(0).getText().equals("0")){
                        addCtxType(ctx, 0);
                        errors.add("Semantic error at line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + ERR_DIV_Z + ctx.getText());
                    }

                    //Si ce ne sont pas des identificateurs alors dec1 et dec2 auront la valeur initiale (true)

                    if (dec1 && dec2 && compatibles(getCtxType(ctx.exp(0)), getCtxType(ctx.exp(1)))) {
                        System.out.println(getCtxType(ctx.exp(0))+"   .   "+ getCtxType(ctx.exp(1)));
                        int t = typeResultat(getCtxType(ctx.exp(0)), getCtxType(ctx.exp(1)));
                        //System.out.println("----------------------"+typeVal.get(ctx.exp(0))+ " -- " +typeVal.get(ctx.exp(1)));


                        if (ctx.exp(0)!=null && ctx.exp(1)!=null){

                            elementValue g = typeVal.get(ctx.exp(0)), d=typeVal.get(ctx.exp(1));
                            if (g.getVal()!= null && d.getVal()!= null)
                                resultat = calculer(g, ctx.opMD(), ctx.opPM(), d);
                            else if (ctx.exp(0)!=null)
                                resultat = g.getVal();
                            else if (ctx.exp(1)!=null)
                                resultat = d.getVal();

                        }
                        else if (ctx.exp(0)!=null)
                            resultat = ctx.exp(0).getText();
                        else if (ctx.exp(1)!=null)
                            resultat = ctx.exp(1).getText();

//                        resultat = calculer(typeVal.get(ctx.exp(0)), ctx.opMD(), ctx.opPM(), typeVal.get(ctx.exp(1)));


                        addCtxType(ctx, t);
                        addCtxVal(ctx,resultat);
                        if(table.getRowByName(ctx.exp(0).getText())!=null)
                        table.getRowByName(ctx.exp(0).getText()).setValue(resultat);

                    }else {
                        addCtxType(ctx, 0);
                        errors.add("Semantic error at line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + ERR_INCOMPATIBILITY + ctx.getText());
                    }

                    //*****************************************************************************************************
/*
                    if (ctx.exp(0)!=null && ctx.exp(1).getText()!=null){
                        System.out.println(ctx.getText()+" ++++++");
//                        resultat = calculer(ctx.exp(0).getText(), ctx.opMD(), ctx.opPM(), ctx.exp(1).getText());
                        resultat = calculer(valeurs.get(ctx.exp(0)), ctx.opMD(), ctx.opPM(), valeurs.get(ctx.exp(1)), typeResultat(getCtxType(ctx.exp(0)), getCtxType(ctx.exp(1))));
                    }
                    else if (ctx.exp(0)!=null)
                        resultat = ctx.exp(0).getText();
                    else if (ctx.exp(1)!=null)
                        resultat = ctx.exp(1).getText();
                    valeurs.put(ctx, resultat);*/
                    //*********************************************************************************************************


                }
                else if (ctx.parG()!=null) { // Dans le cas exp op exp verifier que les 2 expression ont été déclarées si elles sont des ID
                    addCtxVal(ctx, typeVal.get(ctx.exp(0)).getVal());
//                    addCtxVal(ctx, valeurs.get(ctx.exp(0)));
                }
                else if(ctx.MOINS()!=null) {
                    addCtxVal(ctx, "-" + typeVal.get(ctx.exp(0)).getVal());
//                    addCtxVal(ctx, "-" + valeurs.get(ctx.exp(0)));
                }else  if(ctx.INTEGER() != null){
                    System.out.println("INTEGER");
                    addCtxType(ctx, INT);
                    addCtxVal(ctx, ctx.INTEGER().getText());
                }
                else if(ctx.FLOAT() != null){
                    System.out.println("FLOAT");
                    addCtxType(ctx, FLOAT);
                    addCtxVal(ctx,ctx.FLOAT().getText());
                }
                else if (ctx.ID()!=null && table.contains(ctx.ID().getText())){//C'est forcément un ID donc on vérifie s'il est déclaré puis on le trouve dans la ts et on donne son type à l'exp
                    addCtxType(ctx, table.getRowByName(ctx.ID().getText()).getType());
                    addCtxVal(ctx,table.getRowByName(ctx.ID().getText()).getValue());
                }
                else if (ctx.ID()!=null && !table.contains(ctx.ID().getText())) { //id non déclaré
                    errors.add("Semantic error at line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + ERR_NO_DEC + ctx.getText());
                }
            }
        }
        catch (Exception e){

            if (ctx.exp().size() > 1) {
                System.out.println(ctx.exp(1).getText()+" | "+ctx.exp(0).getText()+" line "+e.getStackTrace()[0].getLineNumber()+" error: "+e.toString());
            }
            else if (ctx.exp()!=null)
                System.out.println(ctx.getText()+" line "+e.getStackTrace()[0].getLineNumber()+" error: "+e.toString());
            else System.out.println(""+ctx.exp().toString());

            e.printStackTrace();
            System.out.println(ctx.exp(1).getText()+" | "+ctx.exp(0).getText());
        }
    }

    // Gérer les affectations
    @Override
    public void exitAffectation(TinyLanguageSIIParser.AffectationContext ctx) {
        if (table.contains(ctx.ID().getText()))
        {
            int type1 = table.getRowByName(ctx.ID().getText()).getType();
            int type2 = 0;
            if (ctx.STRING() != null)
                type2 = 3;
            if (ctx.exp() != null)
                type2 = getCtxType(ctx.exp());



            //System.out.println(ctx.exp().getText()+"   ...");
            if(!compatibles(type1, type2))
                errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_INCOMPATIBILITY+ctx.ID().getText() );
            else{
                if(type1 != 3 && type2!= 3){
                    int type = typeResultat(type1, type2);
                    //Récupérer la valeur de l'expression

                    table.getRowByName(ctx.ID().getText()).setValue(getCtxVal(ctx.exp()));

                    String value = getCtxVal(ctx.exp());
                    if (value != null){
                        float f = Float.parseFloat(value.replace(",", "."));
                        //float f = 0;
                        if (value!= null)
                            System.out.println(value+"***");
                        else
                            System.out.println("***");

                        if (type==INT){
                            int i = (int)f;
                            System.out.println(i+" ////////");
                            addCtxVal(ctx, String.valueOf(i));
                            table.getRowByName(ctx.ID().getText()).setValue(String.valueOf(i));
                        }
                        else{
                            addCtxVal(ctx, String.valueOf(f));
                            table.getRowByName(ctx.ID().getText()).setValue(String.valueOf(f));
                        }
                    }
                    addCtxType(ctx, type);
                    addCtxType(ctx.exp(), type);
                }
                else {
                    addCtxType(ctx, 3);
                    table.getRowByName(ctx.ID().getText()).setValue(ctx.STRING().getText());
                }

//                System.out.println(getCtxType(ctx)+"      ***");
//            valeurs.put(ctx,getCtxVal(ctx.exp()));

                table.getRowByName(ctx.ID().getText()).setInit(true);
            }
        }
        else if (ctx.STRING()==null)
            errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ctx.ID().getText() );
    }

    @Override
    public void exitEcrire(TinyLanguageSIIParser.EcrireContext ctx) { // TODO : A revérifier
        //verifier si les variables sont déclarées
        if (ctx.STRING()==null && ctx.ids().getChildCount()>1){
            for (int i=0; i<ctx.ids().getChildCount(); i++)
                if (!ctx.ids().ID(i).getText().equals(",") && !table.contains(ctx.ids().ID(i).getText()))
                    errors.add("Semantic error at line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+ ERR_NO_DEC+ctx.ids().children.get(i).getText() );
        } else if (ctx.STRING()==null) {
            if (!table.contains(ctx.ids().ID(0).getText()))
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
//        types.put(ctx,type);
        if (typeVal.get(ctx)!=null){
//            elementValue ev = new elementValue();
//            ev = typeVal.get(ctx);
//            ev.setType(type);
//            typeVal.put(ctx,ev);
            typeVal.get(ctx).setType(type);
        }
        else
            typeVal.put(ctx,new elementValue(type));
    }

    private int getCtxType(ParserRuleContext ctx) {
        return (typeVal.get(ctx)==null)?0:typeVal.get(ctx).getType();
//        return (types.get(ctx)==null)?0:types.get(ctx);
    }

    private void addCtxVal(ParserRuleContext ctx, String val)
    {
//        valeurs.put(ctx,val);
        if (typeVal.get(ctx)!=null){
//            elementValue ev = new elementValue();
//            ev = typeVal.get(ctx);
//            ev.setVal(val);
//            typeVal.put(ctx,ev);
            typeVal.get(ctx).setVal(val);
        }
        else
            typeVal.put(ctx,new elementValue(val));
    }

    private String getCtxVal(ParserRuleContext ctx) {
//        return valeurs.get(ctx);
        return (typeVal.get(ctx)==null)?"":typeVal.get(ctx).getVal();
    }

    private void clearMaps()
    {
//        types.clear();
//        valeurs.clear();
        typeVal.clear();
    }

    private static boolean compatibles (int type1, int type2)
    {
         /*
         on peut affecter entier à entier ou float
         on peut affecter un float à un float seulement
         on ne peut affecter float ou un entier à string ni l'inverse
        */
        System.out.println(type1+" ---------- "+type2);
        if (type1==FLOAT )
            return type2!=STRING; //type2!=3
        else if (type2==FLOAT )
            return type1!=STRING; //type2!=3
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

    private static String calculer(elementValue gauche, TinyLanguageSIIParser.OpMDContext MD, TinyLanguageSIIParser.OpPMContext PM, elementValue droite){
        System.out.println(gauche+ " op "+ droite);

        float gf;
        float df;
        float f=0;

        df = Float.parseFloat(droite.getVal().replace(",", "."));
        gf = Float.parseFloat(gauche.getVal().replace(",", "."));

        if (MD!=null){
            if (MD.getText().equals("/")){
                f = gf / df;
            } else { //.equals("*")
                f = gf * df;
            }
        } else if (PM.getText()!=null){
            if (PM.getText().equals("+")){
                f = gf + df;
            } else {
                f = gf - df;
            }
        }

        return  String.valueOf(  (float) f );
    }
}
