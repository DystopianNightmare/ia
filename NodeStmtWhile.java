public class NodeStmtWhile extends NodeStmt {

    private NodeBool bool;
    private NodeStmt stmt;

    public NodeStmtWhile(NodeBool bool, NodeStmt stmt) {
        this.bool = bool;
        this.stmt = stmt;
    }

    @Override
    public Double eval(Environment env) throws EvalException {
        double i = 0.0;
        while (bool.eval(env) == 1) {
             i+= stmt.eval(env);
        }
        return i;
    }
}
