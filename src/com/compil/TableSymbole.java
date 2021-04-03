package com.compil;

import java.util.ArrayList;

/**
 * La table des symboles doit être mise à jour à chacune des étapes suivantes
 * - Déclaration d'une classe
 * - D"claration d'une variable
 * - Utilisation d'une variable (v"rifier la déclaration)
 * - Mise à jour d'une valeur d'une variable
 */
public class TableSymbole {

    //declaring the TS as an array of row
    public ArrayList<row> rows = new ArrayList<row>();

    static public class row {

        String name;
        int declared; // 0:undeclared 1:declared
        int type; // 1:intcompil 2:floatcompil 3:stringcompil
        boolean used;

        //Pour représenter la valeur donnée à la variable TODO : à implémenter
        int init_I;
        double init_D;
        String init_S;
        Object init; // TODO on pourra remplacer object par une structure valeur

        public row(String name, int declared, int type) {
            this.name = name;
            this.declared = declared;
            this.type = type;
        }

        //la variable used n'est pas obligatoire
        public row(String name, int declared, int type, Boolean used) {
            this.name = name;
            this.declared = declared;
            this.type = type;
            this.used = used;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDeclared() {
            return declared;
        }

        public void setDeclared(int declared) {
            this.declared = declared;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Boolean getUsed() {
            return used;
        }

        public void setUsed(Boolean used) {
            this.used = used;
        }

        public Object getInit() {
            return init;
        }

        public void setInit(Object init) {
            this.init = init;
        }
    }

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

    //Lookup
    public boolean contains(String name)
    {
        return getRowByName(name) != null;
    }

    //insert
    public void add(row R)
    {
        rows.add(R);
    }

    //permet de donner une valeur à un objet TODO On pourra remplacer l'objet par une structure personnalisée int, douuble& String
    public void putValue(String name, Object o){
        for (TableSymbole.row row : rows)
            if (row.name.compareTo(name) == 0)
                row.setInit(o);
    }
    // Mettre à jour la valeur de declared
    public void declare (String name, int declared){
        for (TableSymbole.row row : rows)
            if (row.name.compareTo(name) == 0)
                row.setDeclared(declared);
    }

    // Mettre à jour la valeur de used
    public void used (String name, Boolean b){
        for (TableSymbole.row row : rows)
            if (row.name.compareTo(name) == 0)
                row.setUsed(b);
    }



    public void deleteByName(String name)
    {
        for (TableSymbole.row row : rows) {
            if (row.name.compareTo(name) == 0)
                delete(row);

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
