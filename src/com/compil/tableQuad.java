package com.compil;

import java.util.ArrayList;
public class tableQuad {

    public ArrayList<quadruple> tableQuadruplets = new ArrayList<quadruple>();
    public static class quadruple {
        String[] Quads;

        public quadruple(String op, String op1, String op2, String result) {
            Quads = new String[4];

            Quads[0] = op;
            Quads[1] = op1;
            Quads[2] = op2;
            Quads[3] = result;
        }

        public String getQuads(int i) {
            return Quads[i];
        }

        public void setQuads(int pos, String op) {
            Quads[pos] = op;
        }

        @Override
        public String toString() {
            return "(" + Quads[0] + "," + Quads[1] + "," + Quads[2] + "," + Quads[3] + ")";
        }
    }

    public void display() {
        System.out.println("Quadrets : ");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 0; i < tableQuadruplets.size(); i++)
            System.out.println(i+" : "+ tableQuadruplets.get(i).toString());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    //insert
    public int add(quadruple q)
    {
        tableQuadruplets.add(q);
        return tableQuadruplets.size()-1;
    }

    public void add(String op, String op1, String op2, String r)
    {
        quadruple q = new quadruple(op, op1, op2, r);
        tableQuadruplets.add(q);
    }

    public quadruple getQuad(int qc) {
        return tableQuadruplets.get(qc);
    }

    public int getSize()
    {
        return tableQuadruplets.size();
    }
}
