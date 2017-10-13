// Generated from /media/a/linuxData/code/linux/antlr/src/codeLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link codeLangParser}.
 */
public interface codeLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link codeLangParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(codeLangParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeLangParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(codeLangParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeLangParser#edges}.
	 * @param ctx the parse tree
	 */
	void enterEdges(codeLangParser.EdgesContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeLangParser#edges}.
	 * @param ctx the parse tree
	 */
	void exitEdges(codeLangParser.EdgesContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeLangParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(codeLangParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeLangParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(codeLangParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeLangParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(codeLangParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeLangParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(codeLangParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeLangParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(codeLangParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeLangParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(codeLangParser.ToContext ctx);
}