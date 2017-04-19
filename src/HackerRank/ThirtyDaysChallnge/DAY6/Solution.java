package HackerRank.ThirtyDaysChallnge.DAY6;

import java.util.Scanner;

/**
 * Created by deepali on 25-09-2016.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char[] tempch;
        int t = sc.nextInt();
        if (t >= 1 && t <= 10) {
            for (int i = 0; i < t; i++) {
                s = sc.next();
                if (s.length() >= 2 && s.length() <= 10000) {
                    tempch = s.toCharArray();
                    for (int j = 0; j < s.length(); j = j + 2) {
                        System.out.print(tempch[j]);
                    }
                    System.out.print(" ");
                    for (int j = 1; j < s.length(); j = j + 2) {
                        System.out.print(tempch[j]);
                    }
                    System.out.println();
                }
            }
        }
    }

}
