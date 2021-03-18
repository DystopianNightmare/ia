public class NodeStmtRd extends NodeStmt{



    private NodeFact id;

    public NodeStmtRd(NodeFact id){
        this.id=id;
    }

    public Double eval(Environment env) throws EvalException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double val = scanner.nextDouble();
        return env.put(id.toString(),val);
    }
//    public String toString(){
//        return id.toString();
//    }
}
