package HackerRank.ThirtyDaysChallnge.DAY10;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by deepali on 06-10-2016.
 */
public class DecimalToBinaryTofindConsecutives1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stackORemainder = new Stack<>();
        int currentLength = 0, maxLength = 0;
        int n = in.nextInt(), i = 0, remainder = 0, binary = 0, base = 1;
        if (n >= 1 && n <= 1000000) {
            while (n > 0) {
                //        remainder = n % 2 ;

                if (n % 2 == 1) {
                    currentLength = currentLength + 1;
                } else {
                    currentLength = 0;
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                //    stackORemainder.push(n % 2);
                n = n / 2;
                i++;
      /*      binary = binary + remainder * base ;
            base = base * 10;
      */
            }
        }
        System.out.println(maxLength);

        /*System.out.println(binary);
        System.out.println("binary representations is :");
        while(! (stackORemainder.isEmpty())){
            System.out.print(stackORemainder.pop());
        }*/

    }
}
