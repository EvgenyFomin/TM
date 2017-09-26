import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(GrammarParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(GrammarParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(GrammarParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GrammarParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNumber(GrammarParser.BoolNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBConst(GrammarParser.BConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBVar(GrammarParser.BVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(GrammarParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAdd(GrammarParser.BoolAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolMult(GrammarParser.BoolMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolUnary(GrammarParser.BoolUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolCmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCmp(GrammarParser.BoolCmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolElement(GrammarParser.BoolElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(GrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#linc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinc(GrammarParser.LincContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rinc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRinc(GrammarParser.RincContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss(GrammarParser.AssContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#opass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpass(GrammarParser.OpassContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForc(GrammarParser.ForcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDec(GrammarParser.ForDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(GrammarParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAssign(GrammarParser.ForAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whilec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilec(GrammarParser.WhilecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(GrammarParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iftrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIftrue(GrammarParser.IftrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iffalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIffalse(GrammarParser.IffalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(GrammarParser.ReadContext ctx);
}