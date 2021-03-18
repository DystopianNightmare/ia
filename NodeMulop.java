/**
 * extends node
 */
public class NodeMulop extends Node {

    private String mulop;			//holds mulop

	/**
	 * sets pos and mulop
	 * @param pos
	 * @param mulop
	 */
    public NodeMulop(int pos, String mulop) {
	this.pos=pos;
	this.mulop=mulop;
    }

	/**
	 * checks for * or / and evaluates
	 * @param o1 - first value
	 * @param o2 - second value
	 * @return - evaluated expression or exception
	 * @throws EvalException
	 */
    public double op(Double o1, Double o2) throws EvalException {
	if (mulop.equals("*"))
	    return o1*o2;
	if (mulop.equals("/"))
	    return o1/o2;
	throw new EvalException(pos,"bogus mulop: "+mulop);
    }

}
