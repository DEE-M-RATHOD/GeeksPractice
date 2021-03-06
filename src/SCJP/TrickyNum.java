package SCJP;

/**
 * Created by deepali on 13-05-2016.
 */
public class TrickyNum<X extends Number> {

    private X x;

    public TrickyNum(X x) {
        this.x = x;
    }

    private double getDouble() {
        return x.doubleValue();
    }

    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}