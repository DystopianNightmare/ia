
public class NodeBlock extends Node {


    private NodeBlock block;
    private NodeStmt stmt;

    public NodeBlock(NodeStmt stmt, NodeBlock block){
        this.stmt=stmt;
        this.block=block;
    }
    public Double eval(Environment env) throws EvalException {
        return block ==null ? stmt.eval(env) :
                stmt.eval(env) + block.eval(env);
    }
}
