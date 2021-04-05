package com.compil;

import com.sun.jdi.Type;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;

public class elementValue implements Comparable<elementValue>{

    public static final elementValue NULL = new elementValue();
    public static final elementValue VOID = new elementValue();

    private Object value;

    public elementValue() {
        this.value = new Object();
    }

    private elementValue(Object val){
        if (val == null){
            throw new RuntimeException("val is null");
        }
        value = val;

        //Accepter float, string et int seulement
        if(!(isNumber() || isString())){
            throw new RuntimeException("Invalid Data Type "+val+" "+val.getClass());
        }


    }


    public boolean isString() {
        return value instanceof String;
    }

    public boolean isNumber() {
        return value instanceof Number;
    }
    public boolean isNull() {
        return this == NULL;
    }

    public boolean isVoid() {
        return this == VOID;
    }

    @Override
    public String toString() {
        return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
    }

    @Override
    public int compareTo(elementValue otherElement) {
        if(this.isNumber() && otherElement.isNumber())
            if (this.equals(otherElement))
                return 0;
        else if (this.isString() && otherElement.isString())
            return this.toString().compareTo(otherElement.toString());
        else
            throw new RuntimeException("Incomparable types "+this+" is "+ this.getClass()+" and "+ otherElement+" is "+ otherElement.getClass());
        return 1;
    }


    @Override
    public boolean equals(Object o) {
        if(this == VOID || o == VOID) {
            throw new RuntimeException("can't use VOID: " + this + " ==/!= " + o);
        }
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }
        elementValue otherElement = (elementValue)o;
        if(this.isNumber() && otherElement.isNumber()) {
            double diff = Math.abs(((Number)this.value).doubleValue() - ((Number)otherElement.value).doubleValue());
            return diff < 0.0000000001; // 10^-10
        }
        else {
            return this.value.equals(otherElement.value);
        }
    }

    /*
    private Value value;
    public Value getValue() {
        return value;
    }

    public void setVal(Value value) {
        this.value = value;
    }

    public <T> void setValue(T value) {
        if (this.value == null) this.value = new Value() {
            @Override
            public VirtualMachine virtualMachine() {
                return null;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public Type type() {
                return null;
            }
        };
        if(value instanceof Float){
            this.setVal((Float)value);
        }
    }*/
}



