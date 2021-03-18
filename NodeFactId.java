/**
 * extends nodefact class -
 */
public class NodeFactId extends NodeFact {

    private String id;      //holds id

    /**
     * first term in mulup sequence
     * @param pos - position
     * @param id - id
     */
    public NodeFactId(int pos, String id) {
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
	return env.get(id);
    }
    public String toString(){
        return id;
    }
}
