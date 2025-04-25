// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/GLSLParser.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLSLParser}.
 */
public interface GLSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GLSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GLSLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GLSLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GLSLParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GLSLParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#layout}.
	 * @param ctx the parse tree
	 */
	void enterLayout(GLSLParser.LayoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#layout}.
	 * @param ctx the parse tree
	 */
	void exitLayout(GLSLParser.LayoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#uniform}.
	 * @param ctx the parse tree
	 */
	void enterUniform(GLSLParser.UniformContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#uniform}.
	 * @param ctx the parse tree
	 */
	void exitUniform(GLSLParser.UniformContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(GLSLParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(GLSLParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(GLSLParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(GLSLParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(GLSLParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(GLSLParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(GLSLParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(GLSLParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GLSLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GLSLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLSLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GLSLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLSLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GLSLParser.NameContext ctx);
}