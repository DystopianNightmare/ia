/**
 * extends node used to assign a value
 */
public class NodeAssn extends Node {

    private String id;                  //id of node
    private NodeExpr expr;              //expression

    /**
     * set
     * @param id - sets node id
     * @param expr - sets expression
     */
    public NodeAssn(String id, NodeExpr expr) {
	this.id=id;
	this.expr=expr;
    }

    /**
     *
     * @param env - environment
     * @return puts map and returns freq
     * @throws EvalException
     */
    public Double eval(Environment env) throws EvalException {
	return env.put(id,expr.eval(env));
    }

}
