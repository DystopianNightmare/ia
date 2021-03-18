// This is the main class/method for the interpreter.
// Each command-line argument is a complete program,
// which is scanned, parsed, and evaluated.
// All evaluations share the same environment,
// so they can share variables.

public class Interpreter {

	/**
	 * main method
	 * @param args
	 */
    public static void main(String[] args) {
		Parser parser = new Parser();                                //get new parser
		Environment env = new Environment();                        //get new environment
		for (String stmt : args) {                               	 //for each (string) stmt in args do
			try {                                               	 //begin try/catch
				System.out.println(parser.parse(stmt).eval(env));    //print the result of parseing the args array
			} catch (SyntaxException e) {                      		  //catch syntaxexception
				System.err.println(e);                         	       //print the error to stderr
			} catch (EvalException e) {                        	    //catch evalexception
				System.err.println(e);                                //print err to stderr
			}
		}
	}
}


// Do I need to make a new environement so it handles them separately
//or maybe build all the args into a stirng and then parse that?