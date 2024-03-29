package com.compil;
import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;

/* Random Notes :
The biggest difference between the listener and visitor mechanisms is that
listener methods are called by the ANTLR-provided walker object, whereas
visitor methods must walk their children with explicit visit calls.
 */

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<String> errors = new ArrayList<>();

            // create a CharStream that reads from standard input
            CharStream input = CharStreams.fromFileName("src/test.txt");

            // create a lexer that feeds off of input CharStream
            TinyLanguageSIILexer lexer = new TinyLanguageSIILexer(input);

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Handeling errors
            errorListener eListener = new errorListener(errors);

            // create a parser that feeds off the tokens buffer
            TinyLanguageSIIParser parser = new TinyLanguageSIIParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(eListener);
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

            // begin parsing at chosen rule
            ParseTree tree = parser.programme();

            // create the Symbols Table and initiate it with an errors array
            routinesTS routinesTabSymbol = new routinesTS(errors);
            routinesQuad routinesQuadruplets = new routinesQuad(errors);

            //A tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();

            // Walk the tree created during the parse
            walker.walk(routinesTabSymbol, tree);
            ocGenerator oc = new ocGenerator();

            routinesTabSymbol.getTable().display();
            if (errors.size()==0) {
                     walker.walk(routinesQuadruplets, tree);
                     routinesQuadruplets.getTable().display();
                     oc.Assemble(routinesQuadruplets.getTable());
                     oc.display();
                }
                System.out.println("///////////////////---- COMPILING COMPLETED ----///////////////////");
                //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        } catch (Exception e){
           /* if (e.getMessage() != null){
                    System.out.println("Exception caught at line "+e.getStackTrace()[0].getLineNumber()+": "+e.getMessage());
            } else {*/
                    e.printStackTrace();
           // }
        }
    }
}