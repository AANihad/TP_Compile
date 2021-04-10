package com.compil;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class errorListener extends BaseErrorListener {

    ArrayList<String> errors = new ArrayList<>();
    public errorListener(ArrayList<String> errors) {
        this.errors = errors;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        errors.add("Syntaxic error at line "+line+":"+charPositionInLine+" at "+ offendingSymbol+": "+msg);
//        System.err.println("rule stack: "+stack);
//        System.err.println("line "+line+":"+charPositionInLine+" at "+ offendingSymbol+": "+msg);
    }
}
