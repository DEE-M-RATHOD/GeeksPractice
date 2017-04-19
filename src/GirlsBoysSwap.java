import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.function.DoubleUnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.spi.LocaleNameProvider;

/**
 * Created by deepali on 30-05-2016.
 */
public class GirlsBoysSwap {

    static TreeMap<Integer, String> finder2 = new TreeMap<>();

    public static void main(String args[]) throws Exception {

        FileOutputStream fos = new FileOutputStream("C://Users//deepali//swap.txt");
        ObjectOutputStream OOS = new ObjectOutputStream(fos);

        Matcher m1;
        String line = new String();
        Pattern p2 = Pattern.compile("b", Pattern.CASE_INSENSITIVE);
        ModScanner1 ms = new ModScanner1();
        int t = ms.nextInt();
        while (t-- > 0 && t <= 5) {
            int n = ms.nextInt();
            line = ms.nextToken();
            line = line.toUpperCase();
            int length = line.length();
            m1 = p2.matcher(line);
            finder2.clear();
            if ((n <= (Math.pow(10.0, 6.0))) && (length == 2 * n)) {
                while (m1.find()) {
           //         OOS.writeInt(m1.start());
                    //                fos.write(m1.start());
                    finder2.put( m1.start(), m1.group());
                }
            }
            fos.flush();
            OOS.close();
            fos.close();
            FileInputStream fis = new FileInputStream("C://Users//deepali//swap.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            long i = 0;
         /*   try {
                while ((i = ois.readInt()) != -1) {
                    System.out.println(i);
                }
            } catch (EOFException e) {
                System.out.println("End of file reached");
            }
            ois.close();
            fis.close();*/
            if ((line.indexOf('B') % 2) == 0) {
                swapCount(true);

            } else {
                swapCount(false);
            }
        }
    }

    private static void swapCount(boolean b) {
        int count = 0;
        int swapRequired =0;
        for (Integer key : finder2.keySet()) {
            long temp = key;

            if ((b == false) && (temp % 2 == 0)) {
                count++;
    //            swapRequired = finder2.size() - count;
            } else if ((b == true) && !(temp % 2 == 0) ) {
                count++;
    //            swapRequired = finder2.size() - count;

            }
        }
        System.out.println(swapRequired);

    }
}

class ModScanner1 {
    BufferedReader br;
    StringTokenizer st;

    public ModScanner1() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}

