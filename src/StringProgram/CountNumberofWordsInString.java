package StringProgram;

import java.util.Scanner;

/**
 * Created by deepali on 15-04-2016.
 */
public class CountNumberofWordsInString {
    public static void main(String[] args) {
        String orgStr = "";
        int count =0;

        orgStr = new Scanner(System.in).nextLine();
        char[] chars = new char[orgStr.length()];
        for(int i=0;i<orgStr.length();i++){
                chars[i] = orgStr.charAt(i);
                if(((i>0) && (chars[i]!=' ') && (chars[i-1]==' ')) || ((chars[0]!=' ') && (i==0))){
                count++;

            }
        }
        System.out.println("no of words " + count);
    }

}
