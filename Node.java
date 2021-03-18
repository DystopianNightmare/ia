// This class, and its subclasses,
// collectively model parse-tree nodes.
// Each kind of node can be eval()-uated.

/**
 * abstract node class
 */
public abstract class Node {

    protected int pos=0;        //pos - avaliable to subclasses

    /**
     *
     * @param env - environment
     * @return int
     * @throws EvalException with position as a parameter
     */
    public Double eval(Environment env) throws EvalException {
	throw new EvalException(pos,"cannot eval() node!");
    }

}
