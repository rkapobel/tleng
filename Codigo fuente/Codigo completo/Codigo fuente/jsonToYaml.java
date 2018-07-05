import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class jsonToYaml {
	public static void main(String[] args) {
		if(args.length==1)//Solo toma como input una unica cadena
		{
			ANTLRInputStream input = new ANTLRInputStream(args[0]);
			TokenStream tokens = new CommonTokenStream(new jsonGrammarLexer(input)); 
			jsonGrammarParser parser = new jsonGrammarParser(tokens); 
			parser.jsonToYaml();
			System.out.print("\n");
		}
		else//Si los parametros no cumplen los requisitos se informa al usuario.
		{
			System.out.println("Error: es necesario ingresar como parámetro una única cadena a traducir");
		}
	}
}
