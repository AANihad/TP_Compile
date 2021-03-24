package com.compil;
import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;

/* Random Notes :
The biggest difference between the listener and visitor mechanisms is that
listener methods are called by the ANTLR-provided walker object, whereas
visitor methods must walk their children with explicit visit calls.
 */

public class Main {
    public static void main(String[] args) throws Exception {
       // try {
                // create a CharStream that reads from standard input
                CharStream input = CharStreams.fromFileName("src/test.txt");

                // create a lexer that feeds off of input CharStream
                TinyLanguageSIILexer lexer = new TinyLanguageSIILexer(input);

                // create a buffer of tokens pulled from the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                // create a parser that feeds off the tokens buffer
                TinyLanguageSIIParser parser = new TinyLanguageSIIParser(tokens);

                ParseTree tree = parser.programme(); // begin parsing at chosen rule

                // create the Symbols Table and initiate it with an errors array
                ArrayList<String> errors = new ArrayList<>();
                routinesTS routinesTabSymbol = new routinesTS(errors);

                //A tree walker that can trigger callbacks
                ParseTreeWalker walker = new ParseTreeWalker();
                // Walk the tree created during the parse
                walker.walk(routinesTabSymbol, tree);

                System.out.println("/////////////////---- FIN ----///////////////////");
//                System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        /*} catch (Exception e){
                if (e.getMessage() != null){
                        System.out.println("Exception caught: "+e.getMessage());
                } else {
                        e.printStackTrace();
                }
        }*/
    }
}