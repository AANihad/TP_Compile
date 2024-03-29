package com.compil;

import java.util.ArrayList;
import java.util.HashMap;

public class ocGenerator {
    private ArrayList <AssemblerInstruction> aInstructions = new ArrayList<>();
    private static int[] etiquettes;
    private static HashMap<String,String> quadToCo = new HashMap<>();

    public ocGenerator() {
        quadToCo.put("+","ADD");
        quadToCo.put("-","SUB");
        quadToCo.put("*","MUL");
        quadToCo.put("/","DIV");

        quadToCo.put("READ", "INPUT");
        quadToCo.put("WRITE", "OUTPUT");

        quadToCo.put("BG", "JG");
        quadToCo.put("BL", "JL");
        quadToCo.put("BGE", "JGE");
        quadToCo.put("BLE", "JLE");
        quadToCo.put("BE", "JE");
        quadToCo.put("BNE", "JNE");

        quadToCo.put("BR", "JMP");
        quadToCo.put("END", "END");
    }

    public static class AssemblerInstruction {
        String inst;
        String op1;
        String op2;
        String etiq = "\t\t";

        public AssemblerInstruction(String inst, String op1, String op2) {
            this.inst = inst;
            this.op1 = op1;
            this.op2 = op2;
        }

        public AssemblerInstruction(String inst, String op1) {
            this.inst = inst;
            this.op1 = op1;
            this.op2 = null;
        }

        public void setEtiq(String etiq) {
            this.etiq = etiq;
        }

        public void setJEtiq(String etiq) {
            this.op1 = etiq;
        }

        static public AssemblerInstruction needsEtiq(String a, String b, String c, boolean etiq, int j){
            AssemblerInstruction i = (c.equals(""))? new AssemblerInstruction(a,b):new AssemblerInstruction(a,b,c);
            if (etiq)
                i.setEtiq("etiq" +j +"\t");
            else
                i.setEtiq("\t\t");
            return i;
        }

        @Override
        public String toString()
        {
            return etiq+" "+inst + " " + op1 + " " + ((op2 == null)?"":op2);
        }
    }

    public ArrayList<AssemblerInstruction> Assemble(tableQuadruplets table){
        etiquettes = new int [table.getSize()];
        int x = -1;
        for(int i=0; i<table.getSize(); i++)
            etiquettes[i]=0;

        for(int i=0; i<table.getSize(); i++){
            if (etiquettes[i]!=0)
                aInstructions.get(etiquettes[i]).setJEtiq("etiq" +i +"\t");

            String o = table.getQuad(i).getOp(0);
            switch (o) {
                case "+":
                case "-":
                case "*":
                case "/" :
                {
                    aInstructions.add(AssemblerInstruction.needsEtiq("MOV", " AX,", table.getQuad(i).getOp(1), table.getQuad(i).getPointedAt(), i));
                    aInstructions.add(new AssemblerInstruction(quadToCo.get(o), " AX,", table.getQuad(i).getOp(2)));
                    aInstructions.add(new AssemblerInstruction("MOV", table.getQuad(i).getOp(3), ", AX"));
                    break;
                }
                case "=" : {
                    aInstructions.add(AssemblerInstruction.needsEtiq("MOV", " AX,", table.getQuad(i).getOp(2), table.getQuad(i).getPointedAt(), i));
                    //aInstructions.add(new AssemblerInstruction("MOV", " AX, ", table.getQuad(i).getOp(2)));
                    aInstructions.add(new AssemblerInstruction("MOV", table.getQuad(i).getOp(3), ", AX"));
                    break;
                }
                case "READ":
                case "WRITE" :
                {
                    aInstructions.add(AssemblerInstruction.needsEtiq(quadToCo.get(o), table.getQuad(i).getOp(1),"",table.getQuad(i).getPointedAt(), i));
                    break;
                }
                case "BG":
                case "BL":
                case "BGE":
                case "BNE":
                case "BLE":
                case "BE" :
                {
                    aInstructions.add(AssemblerInstruction.needsEtiq("MOV", " AX,",table.getQuad(i).getOp(1),table.getQuad(i).getPointedAt(), i));
                    aInstructions.add(new AssemblerInstruction("CMP", " AX,", table.getQuad(i).getOp(2))); //TODO inverser le 3 et le 1 dans les quads de branchement
                    x=  Integer.parseInt((table.getQuad(i).getOp(3).equals(""))?"0":table.getQuad(i).getOp(3));
                    aInstructions.add(new AssemblerInstruction(quadToCo.get(o), "etiq"+x));

                    etiquettes[x]=aInstructions.size()-1;
                    table.getQuad(x).setPointedAt(true);
                    break;
                }
                case "BR" :
                {
                    aInstructions.add(AssemblerInstruction.needsEtiq(quadToCo.get(o), table.getQuad(i).getOp(1),"",table.getQuad(i).getPointedAt(), i));
                    x=  Integer.parseInt((table.getQuad(i).getOp(3).equals(""))?"0":table.getQuad(i).getOp(3));
                    aInstructions.add(new AssemblerInstruction(quadToCo.get(o), "etiq"+x));

                    etiquettes[x]=aInstructions.size()-1;
                    table.getQuad(x).setPointedAt(true);
                    break;
                }
                case "END" :
                {
                    aInstructions.add(AssemblerInstruction.needsEtiq(quadToCo.get(o), "","",table.getQuad(i).getPointedAt(), i));
                    //aInstructions.add(new AssemblerInstruction("END", table.getQuad(i).getOp(1),""));
                    break;
                }
                default :{
                    System.out.println("Invalid : can't find "+o);
                }


            }
        }
        return this.aInstructions;
    }

    public void display() {
        System.out.println("\t\tOBJECT CODE");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("start:\t");
        for (int i = 0; i < aInstructions.size(); i++)
            System.out.println(aInstructions.get(i).toString());
        System.out.println("code ends\t");
        System.out.println("end start\t");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
