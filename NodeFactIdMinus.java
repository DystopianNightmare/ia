public class NodeFactIdMinus extends NodeFact{

    private String id;      //holds id

    /**
     * first term in mulup sequence
     * @param pos - position
     * @param id - id
     */
    public NodeFactIdMinus(int pos, String id) {
        this.pos=pos;
        this.id=id;
    }

    /**
     * evaluates
     * @param env - environment
     * @return evaluated int
     * @throws EvalException
     */
    public Double eval(Environment env) throws EvalException {
        return -env.get(pos,id);
    }

}