package com.compil;

import gen.TinyLanguageSIIBaseVisitor;
import gen.TinyLanguageSIIParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class myVisitor extends TinyLanguageSIIBaseVisitor<Integer> {

    private static final int INT = 1;
    private static final int FLOAT = 2;
    private static final int STRING = 3;

    private static final int DECLARED = 1;
    private static final int UNDECLARED = 0;

    private HashMap<ParserRuleContext, Integer> types = new HashMap<>();
    private ArrayList<String> errors = new ArrayList<>();
    private TableSymbole table = new TableSymbole();

    public myVisitor(ArrayList<String> errors) {
        this.errors = errors;
    }
    public TableSymbole getTable() {
        return table;
    }

    @Override
    public Integer visitProgramme(TinyLanguageSIIParser.ProgrammeContext ctx) {
        return super.visitProgramme(ctx);
    }
}
