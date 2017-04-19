package HackerRank.ThirtyDaysChallnge.DAY3;

import java.util.Scanner;

/**
 * Created by deepali on 23-09-2016.
 */
public class ConditionalStatment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if( n >=1 && n <=100){

            if(n%2==1){
                ans = "Weird";
            }
            else{
                if( n >= 2  && n <=5) {
                    ans = "Not Weird";
                }
                if(n >=6 && n <= 20){
                    ans = "Weird";
                }
                if( n > 20){
                    ans = "Not Weird";
                }
                // Complete the code
            }
            System.out.println(ans);
        }

    }

}
