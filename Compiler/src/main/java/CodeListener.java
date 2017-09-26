import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class CodeListener extends GrammarBaseListener {
    private int ind = 1;

    private static ArrayList<String> code = new ArrayList<>();
    private static HashMap<String, Integer> var = new HashMap<>();
    private static Stack<Integer> lineRef = new Stack<>();
    private static Stack<Integer> linePos = new Stack<>();
    private static Stack<Integer> forPos = new Stack<>();


    static ArrayList<String> getAnswer(){
        return code;
    }

    @Override public void exitStart(GrammarParser.StartContext ctx) {
        code.add("return");
    }

    //--------------EXPRESSION--------------------

    @Override public void exitNum(GrammarParser.NumContext ctx) {
        code.add("push " + ctx.getText());
    }

    @Override public void exitVar(GrammarParser.VarContext ctx) {
        code.add("load " + var.get(ctx.getText()));
    }

    @Override public void exitAdd(GrammarParser.AddContext ctx) {
        if (ctx.getChildCount() > 1) {
            String sign = ctx.getChild(1).getText();
            switch (sign) {
                case "+": code.add("add"); break;
                case "-": code.add("sub"); break;
            }
        }
    }

    @Override public void exitMult(GrammarParser.MultContext ctx) {
        if (ctx.getChildCount() > 1) {
            String sign = ctx.getChild(1).getText();

            switch (sign) {
                case "*":
                    code.add("mul");
                    break;
                case "/":
                    code.add("div");
                    break;
                case "%":
                    code.add("rem");
                    break;
            }
        }
    }

    @Override public void exitUnary(GrammarParser.UnaryContext ctx) {
        if (ctx.getChildCount() > 1){
            code.add("neg");
        }
    }

    //--------------BOOL--------------------

    @Override public void exitBConst(GrammarParser.BConstContext ctx) {
        String bool = ctx.BCONST().getText();
        if (bool.equals("true")) {
            code.add("push 1");
        } else if (bool.equals("false")) {
            code.add("push 0");
        }
    }

    @Override public void exitBVar(GrammarParser.BVarContext ctx) {
        int num = var.get(ctx.VAR().getText());
        code.add("push " + num);
    }

    @Override public void exitBoolAdd(GrammarParser.BoolAddContext ctx) {
        if (ctx.getChildCount() > 1) {
            String sign = ctx.getChild(1).getText();
            switch (sign) {
                case "||": code.add("or"); break;
                case "^": code.add("xor"); break;
            }
        }
    }

    @Override public void exitBoolMult(GrammarParser.BoolMultContext ctx) {
        if (ctx.getChildCount() > 1) {
            String sign = ctx.getChild(1).getText();

            switch (sign) {
                case "&&":
                    code.add("and");
                    break;
            }
        }
    }

    @Override public void exitBoolUnary(GrammarParser.BoolUnaryContext ctx) {
        if (ctx.getChildCount() > 1){
            code.add("bneg");
        }
    }

    @Override public void exitBoolCmp(GrammarParser.BoolCmpContext ctx) {
        String sign = ctx.getChild(1).getText();

        switch (sign) {
            case "==":
                code.add("ceq");
                break;
            case "!=":
                code.add("cne");
                break;
            case "<":
                code.add("clt");
                break;
            case ">":
                code.add("cgt");
                break;
            case "<=":
                code.add("cle");
                break;
            case ">=":
                code.add("cge");
                break;
        }
    }

    //------------ASSIGN & DECLARATION--------------------

    @Override public void exitLinc(GrammarParser.LincContext ctx) {
        code.add("load " + var.get(ctx.VAR().getText()));
        code.add("push 1");
        if (ctx.getChild(0).getText().equals("++")) {
            code.add("add");
        } else if (ctx.getChild(0).getText().equals("--")){
            code.add("sub");
        }
        code.add("store " + var.get(ctx.VAR().getText()));
        code.add("load " + var.get(ctx.VAR().getText()));
    }

    @Override public void exitRinc(GrammarParser.RincContext ctx) {
        code.add("load " + var.get(ctx.VAR().getText()));
        code.add("dup");
        code.add("push 1");
        if (ctx.getChild(1).getText().equals("++")) {
            code.add("add");
        } else if (ctx.getChild(1).getText().equals("--")){
            code.add("sub");
        }
        code.add("store " + var.get(ctx.VAR().getText()));
    }

    @Override public void exitAss(GrammarParser.AssContext ctx) {
        code.add("store " + var.get(ctx.VAR().getText()));
        code.add("load " + var.get(ctx.VAR().getText()));
    }

    /**
     *  a /= b;
     *  a = a / b;
     *  stack: ... b, a
     */
    @Override public void exitOpass(GrammarParser.OpassContext ctx) {
        code.add("load " + var.get(ctx.VAR().getText()));
        String op = ctx.getChild(1).getText();
        switch (op) {
            case "+=": code.add("add"); break;
            case "-=": code.add("sub"); break;
            case "*=": code.add("mul"); break;
            case "/=": code.add("div"); break;
            case "%=": code.add("rem"); break;
        }
        code.add("store " + var.get(ctx.VAR().getText()));
        code.add("load " + var.get(ctx.VAR().getText()));
    }

    @Override public void enterDeclaration(GrammarParser.DeclarationContext ctx) {
        String varName = ctx.VAR().getText();
        var.put(varName, ind);
        ind++;
    }

    @Override public void exitDeclaration(GrammarParser.DeclarationContext ctx) {
        if (ctx.getChildCount() > 3){
            code.add("store " + var.get(ctx.VAR().getText()));
        }
    }

    //--------------MAIN OPERATORS------------------

    @Override public void enterIftrue(GrammarParser.IftrueContext ctx) {
        linePos.push(code.size());
    }

    @Override public void exitIftrue(GrammarParser.IftrueContext ctx) {
        int ref = code.size() + linePos.size();

        // +1 = adding goto after ifBody
        if (ctx.getParent().getChildCount() > 5) {
            ref++;
        }
        code.add(linePos.pop(), "ifncmp " + ref);

    }

    @Override public void enterIffalse(GrammarParser.IffalseContext ctx) {
        linePos.push(code.size());
    }

    @Override public void exitIffalse(GrammarParser.IffalseContext ctx) {
        int ref = code.size() + linePos.size();
        code.add(linePos.pop(), "goto " + ref);
    }

    //Reference for goto
    @Override public void enterCondition(GrammarParser.ConditionContext ctx) {
        code.add("push 0");
        code.add("store 0");
        lineRef.push(code.size());
    }

    //Place to put ifncmp
    @Override public void exitCondition(GrammarParser.ConditionContext ctx) {

        linePos.push(code.size());
    }

    @Override
    public void enterForAssign(GrammarParser.ForAssignContext ctx) {
        code.add("load 0");
        forPos.push(code.size());
    }

    @Override
    public void exitForAssign(GrammarParser.ForAssignContext ctx) {
        int ref = code.size() + forPos.size() + 1; // adding goto after body;
        code.add(forPos.pop(), "ifncmp " + ref);
    }

    @Override public void exitBody(GrammarParser.BodyContext ctx) {
        code.add("push 1");
        code.add("store 0");
        int ref = code.size() + linePos.size() + 1; // adding goto after body;
        code.add(linePos.pop(), "ifncmp " + ref);
        code.add("goto " + lineRef.pop());
    }

    //--------------READ/PRINT--------------------

    @Override public void exitPrint(GrammarParser.PrintContext ctx) {
        code.add("print");
    }

    @Override public void exitRead(GrammarParser.ReadContext ctx) {
        code.add("read");
    }
}