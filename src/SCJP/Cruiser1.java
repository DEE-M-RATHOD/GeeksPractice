package SCJP;

/**
 * Created by deepali on 13-05-2016.
 */
public class Cruiser1 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Cruiser1());
        a.start();

        System.out.print("Begin");
        a.join();
        System.out.print("End");
    }

    public void run() {
        System.out.print("Run");
    }
}