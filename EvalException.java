
public class EvalException extends Exception {

    private int pos;
    private String msg;

    /**
     * is a thrown exception
     * @param pos position where exception was thrown
     * @param msg message of exception
     */
    public EvalException(int pos, String msg) {
	this.pos=pos;
	this.msg=msg;
    }

    /**
     * Builds this exceptions own toString
     * @override toString()
     * @return expection string
     */
    public String toString() {
	return "eval error"
	    +", pos="+pos
	    +", "+msg;
    }

}
