public class NodeFactExprMinus extends NodeFact{

    private NodeExpr expr;          //holds expression

    /**
     * sets expressions
     * @param expr - is a nodeexpr expression
     */
    public NodeFactExprMinus(NodeExpr expr) {
        this.expr=expr;
    }

    /**
     * evaluated an expression
     * @param env - environment
     * @return int - evalauted
     * @throws EvalException
     */
    public Double eval(Environment env) throws EvalException {
        return -expr.eval(env);
    }

}