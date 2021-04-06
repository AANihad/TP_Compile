package com.compil;

import java.util.ArrayList;

public class ocGenerator {
    private tableQuadruplets table = new tableQuadruplets();
    private ArrayList <AssemblerInstruction> aInstructions = new ArrayList<>();

    public static class AssemblerInstruction {
        public AssemblerInstruction(String op1, String op2, String var) {
        }
        /*public static ArrayList<String> addSubMulDiv(tableQuad.quadruple){
            ArrayList<String> assembled = new ArrayList<>();

        }*/
    }

    public void object(){
        for (int i = 0; i<table.table.size(); i++){
            //TODO : Make a HashMap with SUB DIV and MUL
            if (table.getQuad(i).getOp(0).equals("+")){
                aInstructions.add(new AssemblerInstruction("MOV ", "AX, ", table.getQuad(i).getOp(1)));
                aInstructions.add(new AssemblerInstruction("ADD", "AX, ", table.getQuad(i).getOp(2)));
                aInstructions.add(new AssemblerInstruction("MOV ", table.getQuad(i).getOp(3), ", AX"));
            }
        }
    }


    }
