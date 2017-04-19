package SCJP;

/**
 * Created by deepali on 13-05-2016.
 */

public class Cruiser {
    private int a = 0;

    public void foo() {
        Runnable r = new LittleCruiser();
        new Thread(r).start();
        new Thread(r).start();
    }

    public static void main(String arg[]) {
        Cruiser c = new Cruiser();
        c.foo();
    }

    public class LittleCruiser implements Runnable {
        public void run() {
            int current = 0;
            for (int i = 0; i < 4; i++) {
                current = a;
                System.out.print(current + ", ");
                a = current + 2;
            }
        }
    }

    /**
     * Created by deepali on 13-05-2016.
     */
    public static class TryMe {
        public static void main(String args[]) {
         /*   Queue<String> q = new PriorityQueue<String>();
            q.add("3");
            q.add("1");
            q.add("2");
            System.out.print(q.poll() + " ");
            System.out.print(q.peek() + " ");
            System.out.print(q.peek());*/
            String test = "This is a test string";
            String[] tokens = test.split("\\s");
            System.out.println(tokens.length);
        }
    }
}