// Generated from test.g4 by ANTLR 4.5.3

        package test2;
	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(testParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(testParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ok}.
	 * @param ctx the parse tree
	 */
	void enterOk(testParser.OkContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ok}.
	 * @param ctx the parse tree
	 */
	void exitOk(testParser.OkContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(testParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(testParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(testParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(testParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(testParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(testParser.AtomContext ctx);
}