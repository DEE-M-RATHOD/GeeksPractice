package HackerRank.ThirtyDaysChallnge.DAY9;

import java.util.Scanner;

/**
 * Created by deepali on 06-10-2016.
 */
public class RecursionFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        if(n >=2 && n <= 12){
            result = factorial(n);
        }
        System.out.println(result);


    }
    public static int factorial(int n){
        if(n > 1){
            return n * factorial(n-1);
        } else {
            return n;
        }
    }
}
