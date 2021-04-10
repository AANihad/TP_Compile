package com.compil;

import com.sun.jdi.Type;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;

public class elementValue{

//    public static final elementValue NULL = new elementValue();
//    public static final elementValue VOID = new elementValue();

    private int type;
    private String val;

    public elementValue(String val, int type){
        this.type = type;
        this.val= val;
    }

    public elementValue(elementValue ev){
        this.type = ev.type;
        this.val= ev.val;
    }

    public elementValue( int type){
        this.type = type;
    }
    public elementValue(){
    }

    public elementValue(String val){
        this.val= val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}



