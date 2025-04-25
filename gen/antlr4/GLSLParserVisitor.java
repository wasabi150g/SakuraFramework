// Generated from /Users/sushikouta/Desktop/SakuraFramework/src/main/resources/antlr4/GLSLParser.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GLSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GLSLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GLSLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GLSLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(GLSLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#layout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout(GLSLParser.LayoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#uniform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniform(GLSLParser.UniformContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(GLSLParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(GLSLParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(GLSLParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(GLSLParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GLSLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLSLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GLSLParser.NameContext ctx);
}