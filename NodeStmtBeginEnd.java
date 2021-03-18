public class NodeStmtBeginEnd extends NodeStmt{

    NodeBlock block;

    public NodeStmtBeginEnd(NodeBlock block){
        this.block = block;
    }
    public Double eval(Environment env) throws EvalException {
        return block.eval(env);
    }
}
