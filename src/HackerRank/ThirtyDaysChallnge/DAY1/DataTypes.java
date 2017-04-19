package HackerRank.ThirtyDaysChallnge.DAY1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by deepali on 23-09-2016.
 */
public class DataTypes {

   public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
       int x;
       double digit;
       String str = null;

        /* Read and save an integer, double, and String to your variables.*/
       x = scan.nextInt();
       digit = scan.nextDouble();
       scan.nextLine();
       str = scan.next();

        /* Print the sum of both integer variables on a new line. */
       System.out.println(i+x);

        /* Print the sum of the double variables on a new line. */
       System.out.println(new BigDecimal(d+digit).setScale(1, RoundingMode.HALF_UP).doubleValue());

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
       System.out.println(s+str);
       scan.close();


   }
}
