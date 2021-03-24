package com.compil;

import java.util.ArrayList;

public class TableSymbole {

    //declaring the TS as an array of row
    public ArrayList<row> rows = new ArrayList<row>();

    static public class row {

        String name;
        int declared; // 0:undeclared 1:declared
        int type; // 1:intcompil 2:floatcompil 3:stringcompil

        public row(String name, int declared, int type) {
            this.name = name;
            this.declared = declared;
            this.type = type;
        }

        //display one row of the TS
        @Override
        public String toString()
        {
            String dec = (declared == 1)? "declared":"undeclared";
            return " | " + name + " | "
                    + ((type==1)?"intcompil":"floatcompil")
                    + " | " + dec;
        }
    }//end of row

    public void display() {
        System.out.println("Table des Symboles : ");
        System.out.println("\n========================================================");
        for (row r: rows) {
            System.out.println(r.toString());
        }
        System.out.println("\n========================================================");
    }

    public ArrayList<row> getRow() {
        return rows;
    }

    public row getRowByName(String name)
    {
        for (TableSymbole.row row : rows) {
            if (row.name.compareTo(name) == 0)
                return row;
        }
        return null;
    }

    public void setRows(ArrayList<row> rows) {
        this.rows = rows;
    }

    public boolean contains(String name)
    {
        return getRowByName(name) != null;
    }

    public void add(row R)
    {
        rows.add(R);
    }

    public void deleteByName(String name)
    {
        for (int i = 0; i < rows.size(); i++) {
            if(rows.get(i).name.compareTo(name)==0)
            {
                delete(rows.get(i));
                return;
            }
        }
    }

    public void delete(row R)
    {
        rows.remove(R);
    }

    public int getSize()
    {
        return rows.size();
    }
}
