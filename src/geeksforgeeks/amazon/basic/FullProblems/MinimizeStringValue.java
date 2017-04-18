package geeksforgeeks.amazon.basic.FullProblems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by erdee on 16-02-2017.
 */
/*String amazon*/
/*Given a string of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of ‘k’ characters.  The value of a string is defined as sum of squares of count of each distinct character. For example consider the string “saideep”, here frequencies of characters are s-1, a-1, i-1,e-2, d-1, p-1 and value of the string is 1^2 + 1^2 + 1^2 + 1^2 + 1^1 + 2^2 = 9.

        Input:
        The first line of input contains the number T denoting the no of test cases . Then T test cases follow. .Each test case contains two lines.The first line of each test case contains a string str. The second line of each test case consist of an integer k .

        Output:
        The output for each test case will be an integer denoting the min possible value of the string.

        Constraints:
        1<=T<=100
        1<=str<=50
        1<=k<=50

        Example:
        Input
        2
        abccc
        1
        aaab
        2
        Output
        6
        2*/
/*
We can use an array to store frequency of each character.

        Then do following k times

        ..........1) Find a maximum frequency character and decrements its frequency by 1.

        After k iterations print the value function you get by remaining characters.

*/

public class MinimizeStringValue {
    /*  public static void main(String[] args) {
          TreeMap<Character, Integer> map;
          Scanner s = new Scanner(System.in);
          int t = s.nextInt();
          while (t > 0) {
              int min = 0;
              map = new TreeMap<Character, Integer>();
              String st = s.next();
              StringBuilder str = new StringBuilder(st.trim());
              int k = s.nextInt();
              map.put(str.charAt(0), 1);
              for (int i = 1; i < str.length(); i++) {
                  if (map.containsKey(str.charAt(i)))
                      map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                  else
                      map.put(str.charAt(i), 1);
              }
              Integer arr[] = new Integer[map.size()];
              map.values().toArray(arr);
              Arrays.sort(arr);
              if (k <= st.length()) {
                  for (int i = arr.length - 1; k > 0; k--) {
                      if (arr[i] != 0) {
                          arr[i]--;
                          Arrays.sort(arr);
                      } else
                          i--;
                  }
                  for (int i = 0; i < arr.length; i++) {
                      min += Math.pow(arr[i], 2);
                  }
              }
              System.out.println(min);
              t--;
          }
      }
  */
}
