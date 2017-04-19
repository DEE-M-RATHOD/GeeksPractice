package www.javarevisited.blogspot.com;

import java.util.Scanner;

/**
 * Created by deepali on 07-03-2016.
 */
public class StringPalindrome {
    public static void main(String[] args) {
     /*   String reverseStr = "";
        System.out.println("enter string");
        String Originalstr = new Scanner(System.in).nextLine();
        int length = Originalstr.length();
        for (int i = length -1 ; i>=0; i-- ){
            reverseStr = reverseStr + Originalstr.charAt(i);
        }
        if(Originalstr.equals(reverseStr)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("not palindrome string");
        }
*/
        System.out.println("Enter string:");
        String inputString = new Scanner(System.in).nextLine();
        int length = inputString.length();
        int begin = 0, i =0;
        int end = length - 1;
        int middle = (begin + end)/2;
        for ( i = begin ; i<= middle ; i++){
            if(inputString.charAt(begin) == inputString.charAt(end)){
                begin ++;
                end -- ;

            }else {
                break;
            }
        }
        if( i == middle + 1 ){
            System.out.println("STring palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
