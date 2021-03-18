/**
 * extends node used for operation
 */
public class NodeAddop extends Node {

    private String addop;							// add operation

	/**
	 *
	 * @param pos - inherited from node
	 * @param addop -  add operation
	 */
    public NodeAddop(int pos, String addop) {
	this.pos=pos;
	this.addop=addop;
    }

	/**
	 *
	 * @param o1 first argument from stmt
	 * @param o2 second argument from stmt
	 * @return value of statement addition or eval exception
	 * @throws EvalException if addop is not correct?
	 */
    public double op(Double o1, Double o2) throws EvalException {
	if (addop.equals("+"))
	    return o1+o2;
	if (addop.equals("-"))
	    return o1-o2;
	throw new EvalException(pos,"bogus addop: "+addop);
    }

}
