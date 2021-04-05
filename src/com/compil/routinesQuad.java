package com.compil;

import gen.TinyLanguageSIIBaseListener;
import gen.TinyLanguageSIIParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class routinesQuad extends TinyLanguageSIIBaseListener {

    private ArrayList<String> errors = new ArrayList<>();
    private LinkedList<String> stack = new LinkedList<>();
    private tableQuad table = new tableQuad();

    private static HashMap<String,String> branchements = new HashMap<>();
    private int QC = 0, sauvQC;

    public routinesQuad(ArrayList<String> errors) {
        this.errors = errors;
        branchements.put(">","BLE");        //SUP : '>';
        branchements.put("<","BGE");        //INF : '<';
        branchements.put(">=","BL");        //SUPE : '>=';
        branchements.put("<=","BG");        //INFE : '<=';
        branchements.put("==","BNE");       //EGAL : '==';
        branchements.put("!=","BE");        //DIFF : '!=';

    }

    @Override
    public void exitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx) {
        if (errors.size()>0) {
            System.out.println("No quads generated while there are still errors");
            return;
        }
        table.add("", "", "", "");
    }

    @Override
    public void exitExp(TinyLanguageSIIParser.ExpContext ctx) {
        System.out.println("-- "+ctx.getText()+"  .  "+ctx.exp().size());
        if(ctx.exp().size()==2){
            String op = (ctx.opMD()!=null)? ctx.opMD().getText() :ctx.opPM().getText();
            String s1 = stack.removeLast();
            String s2 = stack.removeLast();
            String T = "T"+(++QC);
            stack.add(T);
            //System.out.println("..."+op+"  .  "+s2+"  .  "+s1+"  .  "+T);
            table.add(op, s2, s1,T);
        }
        else{
            if(ctx.exp() != null){
                stack.add(ctx.getText());
            }
        }
    }

    /*
    @Override
    public void exitFinExp(TinyLanguageSIIParser.FinExpContext ctx) {
        if(ctx!=null){
            String op = (ctx.!=null)? ctx.opMD().getText() :ctx.opPM().getText();
            String s1 = stack.removeLast();
            String s2 = stack.removeLast();
            String T = "Temp"+(++QC);
            stack.add(T);
            table.add(new tableQuad.quadruple(op, s2, s1,T));
        }
    }*/

    @Override
    public void exitAffectation(TinyLanguageSIIParser.AffectationContext ctx) {
        // si on est là c'est qu'on est forcément passés par une expression (fin exp) et donc on a empilé un id
        String s = stack.removeLast();
        table.add("=", s, "",ctx.ID().getText());
    }

    @Override
    public void exitCondition(TinyLanguageSIIParser.ConditionContext ctx) {
        table.getQuad(sauvQC).setQuads(1,table.getSize()+""); // TODO pos = 1 or 3?
    }

    @Override
    public void exitInstElse(TinyLanguageSIIParser.InstElseContext ctx) {
        table.getQuad(sauvQC).setQuads(3, table.getSize()+1+"");
        sauvQC = table.add(new tableQuad.quadruple("BR", "", "", ""));
    }

    @Override
    public void exitCdt(TinyLanguageSIIParser.CdtContext ctx) {

        System.out.println("Condition : "+ctx.getText());
        String gauche = stack.removeLast();
        String droite = stack.removeLast();
        tableQuad.quadruple q = new tableQuad.quadruple(branchements.get(ctx.oplog().getText()), gauche,droite, "");

        System.out.println(q.toString());

        sauvQC = table.add(q);
    }
}
