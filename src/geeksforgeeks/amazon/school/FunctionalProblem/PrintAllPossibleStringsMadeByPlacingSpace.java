package geeksforgeeks.amazon.school.FunctionalProblem;

import java.util.Scanner;

/**
 * Created by deepali on 23-11-2016.
 * <p>
 * /*Recursion  String   Amazon
 */

/*
* Given a string str your task is to complete the function printSpaceString which takes only one argument the string str and  prints all possible strings that can be made by placing spaces (zero or one) in between them.

For eg .  for the string abc all valid strings will be
                abc
                ab c
                a bc
                a b c


Input:
The First line of input takes an integer T denoting the number of test cases . Then T test cases follow . Each line of test case contains a string str .

Output:
For each test case output the strings possible in a single line  separated by a "$"

Constraints:
1<=T<=100
1<=length of string str <=100

Example:
Input
1
abc

Output
abc$ab c$a bc$a b c$
* */

/*
* Input:
wlrb

Its Correct output is:
wlrb$wlr b$wl rb$wl r b$w lrb$w lr b$w l rb$w l r b$

And Your Output is:
wlrb$wlr b$wl r$w lb$w l b$*/

/*
* The idea is to use recursion and create a buffer that one by one contains all output strings having spaces. We keep updating buffer in every recursive call. If the length of given string is �n� our updated string can have maximum length of n + (n-1) i.e. 2n-1. So we create buffer size of 2n (one extra character for string termination).
We leave 1st character as it is, starting from the 2nd character, we can either fill a space or a character. Thus one can write a recursive function like below.
* */

/*
* Time Complexity: Since number of Gaps are n-1, there are total 2^(n-1) patters each having length ranging from n to 2n-1. Thus overall complexity would be O(n*(2^n)).
* */

public class PrintAllPossibleStringsMadeByPlacingSpace {

    public static void main(String[] args) {
        PrintAllPossibleStringsMadeByPlacingSpace g = new PrintAllPossibleStringsMadeByPlacingSpace();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            String s = sc.next();
            g.printSpace(s);
        }
    }

    /*SOLUTION 1*/
/*

    void printSpace(String str) {
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1)
                System.out.print(str.substring(0, i + 1) + "$");
            else
                printSpaceUtil(str.substring(0, i + 1) + " ", str.substring(i + 1, len));
        }
    }

    void printSpaceUtil(String str2, String str) {
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1)
                System.out.print(str2 + str.substring(0, i + 1) + "$");
            else
                printSpaceUtil(str2 + str.substring(0, i + 1) + " ", str.substring(i + 1, len));
        }
    }
*/


    /*Solution 2 */
    void printSpace(String str) {
        // Your code here
        if (str != null && str.length() > 0) {
            _printSpace(str, 1, String.valueOf(str.charAt(0)));
        }

    }

    void _printSpace(String str, int i, String asIsStr) {
        if (i >= str.length()) {
            System.out.print(asIsStr + "$");
            return;
        }

        _printSpace(str, i + 1, asIsStr + str.charAt(i));
        _printSpace(str, i + 1, asIsStr + " " + str.charAt(i));

    }

}
/*SOLUTION 3*/
/* public static void printstr(char ch[],int i,int j,String str,int n)
    {
        if(j==n)
        {
            for(int k=0;k<i;k++)
            System.out.print(ch[k]);
            System.out.print("$");
            return;
        }
        ch[i]=str.charAt(j);
        printstr(ch,i+1,j+1,str,n);

        ch[i]=' ';
        ch[i+1]=str.charAt(j);
        printstr(ch,i+2,j+1,str,n);
    }

    void printSpace(String str)
    {
        // Your code here
        int len=str.length();
        char ch[]=new char[2*len-1];
        ch[0]=str.charAt(0);
        printstr(ch,1,1,str,len);
    }
* */

/*SOLUTION 4*/
/* void printSpace(String str)
    {
        StringBuffer sb = new StringBuffer();
       char[] s = str.toCharArray();
	    printPattern(s,0,sb);

	}

	public static void printPattern(char[] str, int index, StringBuffer sb)
	{
		if(index==str.length)
		{
			System.out.print(sb+"$");
			return;
		}
		sb.append(str[index]);
		printPattern(str,index+1,sb);
		int l = sb.length();
		sb.deleteCharAt(l-1);

		if(index!=0)
		{
		    sb.append(" "+str[index]);
		    printPattern(str,index+1,sb);
		    l = sb.length();
		    sb.deleteCharAt(l-1);
		    sb.deleteCharAt(l-2);
	    }
    }
* */

