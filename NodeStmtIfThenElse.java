public class NodeStmtIfThenElse extends NodeStmt {

   private NodeStmt stmt2;
    private NodeBool bool;
    private NodeStmt stmt;

    public NodeStmtIfThenElse(NodeBool bool, NodeStmt stmt, NodeStmt stmt2){
        this.bool = bool;
        this.stmt = stmt;
        this.stmt2=stmt2;
    }

    @Override
    public Double eval(Environment env) throws EvalException {
        if (bool.eval(env) == 1) {
            return stmt.eval(env);
        }
        return stmt2.eval(env);
    }
}
