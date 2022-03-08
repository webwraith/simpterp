// Generated from F:/Dropbox/src/uni/year_2/CE204/simpterp/src\simpterp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpterpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpterpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpterpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(simpterpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_body(simpterpParser.Stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(simpterpParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpterpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(simpterpParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#do_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop(simpterpParser.Do_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(simpterpParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(simpterpParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(simpterpParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(simpterpParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(simpterpParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(simpterpParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(simpterpParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(simpterpParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpterpParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(simpterpParser.VardeclContext ctx);
}