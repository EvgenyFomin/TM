import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(GrammarParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(GrammarParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(GrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(GrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GrammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GrammarParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolNumber}.
	 * @param ctx the parse tree
	 */
	void enterBoolNumber(GrammarParser.BoolNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolNumber}.
	 * @param ctx the parse tree
	 */
	void exitBoolNumber(GrammarParser.BoolNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bConst}.
	 * @param ctx the parse tree
	 */
	void enterBConst(GrammarParser.BConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bConst}.
	 * @param ctx the parse tree
	 */
	void exitBConst(GrammarParser.BConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bVar}.
	 * @param ctx the parse tree
	 */
	void enterBVar(GrammarParser.BVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bVar}.
	 * @param ctx the parse tree
	 */
	void exitBVar(GrammarParser.BVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(GrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(GrammarParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolAdd}.
	 * @param ctx the parse tree
	 */
	void enterBoolAdd(GrammarParser.BoolAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolAdd}.
	 * @param ctx the parse tree
	 */
	void exitBoolAdd(GrammarParser.BoolAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolMult}.
	 * @param ctx the parse tree
	 */
	void enterBoolMult(GrammarParser.BoolMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolMult}.
	 * @param ctx the parse tree
	 */
	void exitBoolMult(GrammarParser.BoolMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolUnary}.
	 * @param ctx the parse tree
	 */
	void enterBoolUnary(GrammarParser.BoolUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolUnary}.
	 * @param ctx the parse tree
	 */
	void exitBoolUnary(GrammarParser.BoolUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolCmp}.
	 * @param ctx the parse tree
	 */
	void enterBoolCmp(GrammarParser.BoolCmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolCmp}.
	 * @param ctx the parse tree
	 */
	void exitBoolCmp(GrammarParser.BoolCmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolElement}.
	 * @param ctx the parse tree
	 */
	void enterBoolElement(GrammarParser.BoolElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolElement}.
	 * @param ctx the parse tree
	 */
	void exitBoolElement(GrammarParser.BoolElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#linc}.
	 * @param ctx the parse tree
	 */
	void enterLinc(GrammarParser.LincContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#linc}.
	 * @param ctx the parse tree
	 */
	void exitLinc(GrammarParser.LincContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rinc}.
	 * @param ctx the parse tree
	 */
	void enterRinc(GrammarParser.RincContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rinc}.
	 * @param ctx the parse tree
	 */
	void exitRinc(GrammarParser.RincContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ass}.
	 * @param ctx the parse tree
	 */
	void enterAss(GrammarParser.AssContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ass}.
	 * @param ctx the parse tree
	 */
	void exitAss(GrammarParser.AssContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#opass}.
	 * @param ctx the parse tree
	 */
	void enterOpass(GrammarParser.OpassContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#opass}.
	 * @param ctx the parse tree
	 */
	void exitOpass(GrammarParser.OpassContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forc}.
	 * @param ctx the parse tree
	 */
	void enterForc(GrammarParser.ForcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forc}.
	 * @param ctx the parse tree
	 */
	void exitForc(GrammarParser.ForcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forDec}.
	 * @param ctx the parse tree
	 */
	void enterForDec(GrammarParser.ForDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forDec}.
	 * @param ctx the parse tree
	 */
	void exitForDec(GrammarParser.ForDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forCond}.
	 * @param ctx the parse tree
	 */
	void enterForCond(GrammarParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forCond}.
	 * @param ctx the parse tree
	 */
	void exitForCond(GrammarParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forAssign}.
	 * @param ctx the parse tree
	 */
	void enterForAssign(GrammarParser.ForAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forAssign}.
	 * @param ctx the parse tree
	 */
	void exitForAssign(GrammarParser.ForAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whilec}.
	 * @param ctx the parse tree
	 */
	void enterWhilec(GrammarParser.WhilecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whilec}.
	 * @param ctx the parse tree
	 */
	void exitWhilec(GrammarParser.WhilecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(GrammarParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(GrammarParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#iftrue}.
	 * @param ctx the parse tree
	 */
	void enterIftrue(GrammarParser.IftrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#iftrue}.
	 * @param ctx the parse tree
	 */
	void exitIftrue(GrammarParser.IftrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#iffalse}.
	 * @param ctx the parse tree
	 */
	void enterIffalse(GrammarParser.IffalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#iffalse}.
	 * @param ctx the parse tree
	 */
	void exitIffalse(GrammarParser.IffalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GrammarParser.ReadContext ctx);
}