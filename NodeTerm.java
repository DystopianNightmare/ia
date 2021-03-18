/**
 * node term
 * extends node
 */
public class NodeTerm extends Node {

    private NodeFact fact;			//holds nodefact
    private NodeMulop mulop;		//holds mulop
    private NodeTerm term;			//holds term

	/**
	 * setters
	 * @param fact
	 * @param mulop
	 * @param term
	 */
    public NodeTerm(NodeFact fact, NodeMulop mulop, NodeTerm term) {
	this.fact=fact;
	this.mulop=mulop;
	this.term=term;
    }

	/**
	 * appends term
	 * @param term
	 */
	public void append(NodeTerm term) {
	if (this.term==null) {
	    this.mulop=term.mulop;
	    this.term=term;
	    term.mulop=null;
	} else
	    this.term.append(term);
    }

	/**
	 * evaluates
	 * @param env - environment
	 * @return evaluated int
	 * @throws EvalException
	 */
    public Double eval(Environment env) throws EvalException {
	return term==null
	    ? fact.eval(env)
	    : mulop.op(term.eval(env),fact.eval(env));
    }

}
