/**
 * extends fact node
 */
public class NodeFactNum extends NodeFact {

    private String num;     //holds num

    /**
     * set num
     * @param num
     */
    public NodeFactNum(String num) {
	this.num=num;
    }

    /**
     * evaluate number
     * @param env - environment
     * @return evaluated int
     * @throws EvalException
     */
    public Double eval(Environment env) throws EvalException {
	return Double.parseDouble(num);
    }

}
