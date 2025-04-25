// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/WSLParser.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WSLParser}.
 */
public interface WSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(WSLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(WSLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSLParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(WSLParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSLParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(WSLParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSLParser#define_vert}.
	 * @param ctx the parse tree
	 */
	void enterDefine_vert(WSLParser.Define_vertContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSLParser#define_vert}.
	 * @param ctx the parse tree
	 */
	void exitDefine_vert(WSLParser.Define_vertContext ctx);
	/**
	 * Enter a parse tree produced by {@link WSLParser#define_frag}.
	 * @param ctx the parse tree
	 */
	void enterDefine_frag(WSLParser.Define_fragContext ctx);
	/**
	 * Exit a parse tree produced by {@link WSLParser#define_frag}.
	 * @param ctx the parse tree
	 */
	void exitDefine_frag(WSLParser.Define_fragContext ctx);
}