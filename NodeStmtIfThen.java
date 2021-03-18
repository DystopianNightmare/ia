public class NodeStmtIfThen extends NodeStmt{

    private NodeBool bool;
    private NodeStmt stmt;

    public NodeStmtIfThen(NodeBool bool, NodeStmt stmt){
        this.bool = bool;
        this.stmt = stmt;
    }

    @Override
    public Double eval(Environment env) throws EvalException {
        if (bool.eval(env) == 1) {
            return stmt.eval(env);
        }
        return 0.0;
    }
}
