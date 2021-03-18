/**
 * extends abstract nodefact class
 */
public class NodeFactExpr extends NodeFact {

    private NodeExpr expr;          //holds expression

    /**
     * sets expressions
     * @param expr - is a nodeexpr expression
     */
    public NodeFactExpr(NodeExpr expr) {
	this.expr=expr;
    }

    /**
     * evaluated an expression
     * @param env - environment
     * @return int - evalauted
     * @throws EvalException
     */
    public Double eval(Environment env) throws EvalException {
	return expr.eval(env);
    }

}
