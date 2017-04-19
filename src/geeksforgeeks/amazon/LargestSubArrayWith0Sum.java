package geeksforgeeks.amazon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by deepali on 21-11-2016.
 */
public class LargestSubArrayWith0Sum {

    public static void main(String args[]) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int length = 0;
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            length = maxLen(arr, n);
            System.out.println(length);
        }
    }

    static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int max_len = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 && max_len == 0)
                max_len = 1;

            if (sum == 0)
                max_len = i + 1;

            Integer prev_i = hM.get(sum);

            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else
                hM.put(sum, i);
        }

        return max_len;
    }


}
/*
* Largest subarray with 0 sum
array  hashing      Amazon
Given an array having both positive an negative integers . Your task is to complete the function maxLen which returns the length of maximum subarray with 0 sum . The function takes two arguments an array A and n where n is the size of the array A .

Input:
The first line of input contains an element T denoting the No of test cases. Then T test cases follow. Each test case consist of 2 lines. The first line of each test case contains a number denoting the size of the array A. Then in the next line are space separated values of the array A .

Output:
For each test case output will be the length of the largest subarray which has sum 0 .

Constraints:
1<=T<=100
1<=N<=100
-1000<=A[]<=1000

Example:
Input
1
8
15  -2  2  -8  1  7  10 23

Output
5

Explanation
In the above test case the  largest subarray with sum 0 will be -2  2  -8  1  7
*
* */

/*
*
* 84
-776 794 387 -648 363 691 764 -539 -171 -210 -566 783 -861 68 930 -21 -68 394 -10 -228 422 785 199 -314 -412 -90 -955 863 -995 306 85 337 847 314 125 583 815 435 -42 -86 -275 -787 -402 755 933 -675 -738 -225 -93 796 -433 -466 98 -316 -651 -300 -285 866 445 441 32 98 482 710 568 -496 587 307 220 -527 733 504 271 -707 341 797 619 847 922 380 -763 -840 -192 -33

Its Correct output is:
3

And Your Output is:
4*/