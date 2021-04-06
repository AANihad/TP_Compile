package com.compil;

import java.util.ArrayList;
public class tableQuadruplets {

    public ArrayList<quadruple> table = new ArrayList<quadruple>();
    public static class quadruple {
        String[] op;

        public quadruple(String op, String op1, String op2, String result) {
            this.op = new String[4];

            this.op[0] = op;
            this.op[1] = op1;
            this.op[2] = op2;
            this.op[3] = result;
        }

        public String getOp(int i) {
            return op[i];
        }

        public void setOp (int pos, String op) {
            this.op[pos] = op;
        }

        @Override
        public String toString() {
            return "(" + op[0] + "," + op[1] + "," + op[2] + "," + op[3] + ")";
        }
    }

    public void display() {
        System.out.println("\t\tQUADRETS");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 0; i < table.size(); i++)
            System.out.println(i+"- "+ table.get(i).toString());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    //insert
    public int add(quadruple q)
    {
        table.add(q);
        return table.size()-1;
    }

    public void add(String op, String op1, String op2, String r)
    {
        quadruple q = new quadruple(op, op1, op2, r);
        table.add(q);
    }

    public quadruple getQuad(int qc) {
        return table.get(qc);
    }

    public int getSize()
    {
        return table.size();
    }
}
