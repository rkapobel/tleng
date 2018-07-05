// Generated from jsonGrammar.g4 by ANTLR 4.7.1

    import java.util.Set;
	import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsonGrammarParser}.
 */
public interface jsonGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#jsonToYaml}.
	 * @param ctx the parse tree
	 */
	void enterJsonToYaml(jsonGrammarParser.JsonToYamlContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#jsonToYaml}.
	 * @param ctx the parse tree
	 */
	void exitJsonToYaml(jsonGrammarParser.JsonToYamlContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(jsonGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(jsonGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(jsonGrammarParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(jsonGrammarParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(jsonGrammarParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(jsonGrammarParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(jsonGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(jsonGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(jsonGrammarParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(jsonGrammarParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(jsonGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(jsonGrammarParser.ValueContext ctx);
}