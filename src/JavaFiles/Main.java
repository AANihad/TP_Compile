package JavaFiles;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {
    public static void main(String[] args) throws Exception {
        try {   
                // create a CharStream that reads from standard input
                CharStream input = CharStreams.fromFileName("src/test.txt");
                // create a lexer that feeds off of input CharStream
                TinyLanguageSIILexer lexer = new TinyLanguageSIILexer(input);
                // create a buffer of tokens pulled from the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                // create a parser that feeds off the tokens buffer
                TinyLanguageSIIParser parser = new TinyLanguageSIIParser(tokens);
                ParseTree tree = parser.programme(); // begin parsing at chosen rule
                System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        } catch (Exception e){
                if (e.getMessage() != null){
                        System.out.println("Exception :"+e.getMessage());
                } else {
                        e.printStackTrace();
                }
        }
    }
}