
/**
 * extends node used for operation
 */
public class NodeRelop extends Node {

    private String relop;							// add operation

    /**
     *
     * @param pos - inherited from node
     * @param relop -  add operation
     */
    public NodeRelop(int pos, String relop) {
        this.pos=pos;
        this.relop=relop;
    }

    /**
     *
     * @param o1 first argument from stmt
     * @param o2 second argument from stmt
     * @return value of statement addition or eval exception
     * @throws EvalException if addop is not correct?
     */
    public double op(Double o1, Double o2) throws EvalException {
        if (relop.equals("<")) {
            if (o1 < o2) {
                return 1;
            }else {return 0;}
        }
        if (relop.equals(">")) {
            if (o1 > o2) {
                return 1;
            }else {return 0;}
        }
        if (relop.equals(">=")) {
            if (o1 >= o2) {
                return 1;
            }else {return 0;}
        }
        if (relop.equals("<=")) {
            if (o1 <= o2) {
                return 1;
            }else {return 0;}
        }
        if (relop.equals("==")) {
            if (o1.equals(o2)) {
                return 1;
            }else {return 0;}
        }
        if (relop.equals("!=")) {
            if (o1 < o2) {
                return 1;
            }else {return 0;}
        }

        throw new EvalException(pos,"bogus relop: "+relop);
    }

}
