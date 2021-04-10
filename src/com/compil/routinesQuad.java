package com.compil;

import gen.TinyLanguageSIIBaseListener;
import gen.TinyLanguageSIIParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class routinesQuad extends TinyLanguageSIIBaseListener {

    private ArrayList<String> errors = new ArrayList<>();
    private LinkedList<String> stack = new LinkedList<>();
    private tableQuadruplets table = new tableQuadruplets();

    private static HashMap<String,String> branchements = new HashMap<>();
    private int compteurT = 0, sauvQCIf, sauvQcDo;

    public routinesQuad(ArrayList<String> errors) {
        this.errors = errors;
        branchements.put(">","BG");        //(">","BG");
        branchements.put("<","BL");        //("<","BL");
        branchements.put(">=","BGE");      //(">=","BGE");
        branchements.put("<=","BLE");      //("<=","BLE");
        branchements.put("==","BE");       //("==","BE");
        branchements.put("!=","BNE");      //("!=","BNE");
/*
            branchements.put(">","BLE");        //SUP : '>';
            branchements.put("<","BGE");        //INF : '<';
            branchements.put(">=","BL");        //SUPE : '>=';
            branchements.put("<=","BG");        //INFE : '<=';
            branchements.put("==","BNE");       //EGAL : '==';
            branchements.put("!=","BE");        //DIFF : '!=';
*/
    }

    @Override
    public void exitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx) {
        table.add("END", " ", " ", " ");
        if (errors.size()>0) {
            System.out.println("Quads generated while there are still semantic errors");
            return;
        }
        /*else
            table.display();*/
    }

    @Override
    public void exitExp(TinyLanguageSIIParser.ExpContext ctx) {
//        System.out.println("-- "+ctx.getText()+"  .  "+ctx.exp().size());
        if(ctx.exp().size()==2){
            String op = (ctx.opMD()!=null)? ctx.opMD().getText() :ctx.opPM().getText();
            String s1 = stack.removeLast();
            String s2 = stack.removeLast();
            String T = "T"+(++compteurT);
            stack.add(T);
            table.add(op, s2, s1,T);
        }
        else{
            if(ctx.exp() != null){
                stack.add(ctx.getText());
            }
        }
    }

    @Override
    public void exitAffectation(TinyLanguageSIIParser.AffectationContext ctx) {
        // si on est là c'est qu'on est forcément passés par une expression (fin exp) et donc on a empilé un id
        String tmp ="";

        if (ctx.STRING()!=null)
            tmp = ctx.STRING().toString(); //Do We really need it?
        else
            tmp = stack.removeLast();
        table.add("=", " ", tmp,ctx.ID().getText());
    }

/*
    boucle : DO '{' instructions '}' WHILE cdt;
    condition : IF cdt THEN '{' instructions '}' (instElse '{' instructions '}')*;
    cdt : '('exp oplog exp')';
*/
    @Override
    public void exitCondition(TinyLanguageSIIParser.ConditionContext ctx) {
        table.getQuad(sauvQCIf).setOp(3,table.getSize()+"");
    }

    @Override
    public void exitInstElse(TinyLanguageSIIParser.InstElseContext ctx) {
        table.getQuad(sauvQCIf).setOp(3, table.getSize()+1+"");//table.getSize()
        sauvQCIf = table.add(new tableQuadruplets.quadruple("BR", " ", " ", " "));
    }

    @Override
    public void exitCdtIF(TinyLanguageSIIParser.CdtIFContext ctx) {
        String gauche = stack.removeLast();
        String droite = stack.removeLast();
        tableQuadruplets.quadruple q = new tableQuadruplets.quadruple(branchements.get(ctx.oplog().getText()), gauche,droite, "");
//      table.add(branchements.get(ctx.oplog().getText()), gauche,droite, "");

        sauvQCIf = table.add(q);
//        table.getQuad(table.getSize()-1).setPointedAt(true);
    }

    @Override
    public void exitCdtDO(TinyLanguageSIIParser.CdtDOContext ctx) {
        String gauche = stack.removeLast();
        String droite = stack.removeLast();
        table.add(branchements.get(ctx.oplog().getText()), gauche,droite, "");
        table.getQuad(table.getSize()-1).setPointedAt(true);
    }

    @Override
    public void enterBoucle(TinyLanguageSIIParser.BoucleContext ctx) {
        sauvQcDo = table.getSize();
    }

    @Override
    public void exitBoucle(TinyLanguageSIIParser.BoucleContext ctx) {
        table.getQuad(table.getSize()-1).setOp(3, sauvQcDo +"");
    }

    @Override
    public void exitEcrire(TinyLanguageSIIParser.EcrireContext ctx) {
        if (ctx.getChild(2).getChildCount()>1){
            for (int i=0; i<ctx.getChild(2).getChildCount(); i++)
                if (!ctx.ids().children.get(i).getText().equals(","))
                    table.add("WRITE", ctx.getChild(2).getChild(i).getText(), " ", " ");

        }
        else
            table.add("WRITE", ctx.getChild(2).getText(), " ", " ");
    }

    @Override
    public void exitLire(TinyLanguageSIIParser.LireContext ctx) {
        for (int i=0; i<ctx.ids().getChildCount(); i++)
            if (!ctx.ids().children.get(i).getText().equals(","))
                table.add("READ", ctx.ids().children.get(i).getText(), " ", " ");

    }

    public tableQuadruplets getTable() {
        return table;
    }
}
