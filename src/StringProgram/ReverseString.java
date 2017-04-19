package StringProgram;

import java.util.Scanner;

/**
 * Created by deepali on 08-08-2016.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //USING INBUILT METHOD OF STRING BUFFER CLASS
        StringBuffer str = new StringBuffer("deepali");
        System.out.println("1.0 -" + str.reverse() + "----using string buffer  in one line");
        System.out.println("1.1 -" + new StringBuffer("deepali").reverse().toString() + "---using string buffer in one line");
        System.out.println("1.2 -" + new StringBuilder("deepali").reverse().toString() + "----using string builder in one line");
        //WITHOUT USING INBUILT FUNCTION
        // USING ITERATIVE METHOD
        String s = "Mohit";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));

        }
        System.out.println(sb.toString());

        //WITHOUT USING INBUILT FUNCTION
        // USING ITERATIVE METHOD

        char ch[] = s.toCharArray();
        for (int i = s.length() - 1, j = 0; i >= 0; i--) {
            ch[j] = s.charAt(i);
            j++;
        }
        System.out.println(ch);

        //USING RECURSION
        String temp= "dada bhagwan";
        System.out.println(reverseMe(temp));



    }

    private static String reverseMe(String s) {
        /*String reverse = "";
        if (s == null || s.isEmpty()) {
        return  "";
        }
//  n + dada bhagwa,  a+ dada bhagw
        reverse  += s.charAt(s.length() - 1) + reverseMe(s.substring(0, s.length() - 1));
        return reverse;*/

        if (s.length() < 2) {
            return s;
        }
            //ada bhagwan + d
        return reverseMe(s.substring(1)) + s.charAt(0);
    }
}
