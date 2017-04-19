import java.util.Scanner;

/**
 * Created by deepali on 06-03-2016.
 */
public class Palindrome {
    public static void main (String[] args)
    {
        int palindrome = 0;
        System.out.println("enter number ");
        int number = new Scanner(System.in).nextInt();
        int num = number;
        while ( number > 0 ){
            int remainder = number % 10;
            palindrome = (palindrome * 10) + remainder;
            number = number /10;

        }
        if ( num == palindrome){
            System.out.println("number is palindrome ");
        }else {
            System.out.println("number is not pelindrome");
        }

    }
}
