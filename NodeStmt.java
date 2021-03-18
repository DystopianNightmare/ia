/**
 * node stmt
 * extends node
 */
public class NodeStmt extends Node {

    private NodeAssn assn;          //holds assn

    /**
     * sets assn
     * @param assn
     */
    public NodeStmt(NodeAssn assn) {
	this.assn=assn;
    }

    public NodeStmt() {
    }

    /**
     * evaluates
     * @param env - environment
     * @return int
     * @throws EvalException
     */
    public Double eval(Environment env) throws EvalException {
	return assn.eval(env);
    }

}
