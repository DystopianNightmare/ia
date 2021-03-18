/**
 * extends node used for setting the expression
 */
public class NodeExpr extends Node {

    private NodeTerm term;
    private NodeAddop addop;
    private NodeExpr expr;

	/**
	 *
	 * @param term sets nodes term
	 * @param addop sets nodes addop
	 * @param expr sets nodes expression
	 */
    public NodeExpr(NodeTerm term, NodeAddop addop, NodeExpr expr) {
	this.term=term;
	this.addop=addop;
	this.expr=expr;
    }

	/**
	 *  appends expr
	 * @param expr takes a NodeExpr object
	 */
	public void append(NodeExpr expr) {
	if (this.expr==null) {
	    this.addop=expr.addop;
	    this.expr=expr;
	    expr.addop=null;
	} else
	    this.expr.append(expr);
    }

	/**
	 *
	 * @param env - environment
	 * @return integer corresponding to evaluated term
	 * @throws EvalException
	 */
    public Double eval(Environment env) throws EvalException {
	return expr==null
	    ? term.eval(env)
	    : addop.op(expr.eval(env),term.eval(env));
    }
//	public String toString(){return term + " " +addop + " " +expr;}
}
