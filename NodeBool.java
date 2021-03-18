public class NodeBool extends Node {

    private NodeExpr expr1;
    private NodeExpr expr2;
    private NodeRelop relop;

    public NodeBool(NodeExpr expr1, NodeExpr expr2, NodeRelop relop) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.relop = relop;
    }
//    public void append(NodeExpr expr) {
//    if(this.expr2==null){
//        this.relop=expr2.relop;
//        this.expr2=expr2
//    }
//}

    public Double eval(Environment env) throws EvalException {

//        if()

        return expr2==null
                ? expr1.eval(env)
                : relop.op(expr1.eval(env),expr2.eval(env));
    }

}