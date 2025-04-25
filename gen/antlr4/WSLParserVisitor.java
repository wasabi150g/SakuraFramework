// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/WSLParser.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WSLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WSLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(WSLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSLParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(WSLParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSLParser#define_vert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_vert(WSLParser.Define_vertContext ctx);
	/**
	 * Visit a parse tree produced by {@link WSLParser#define_frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_frag(WSLParser.Define_fragContext ctx);
}