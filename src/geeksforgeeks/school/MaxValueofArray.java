package geeksforgeeks.school;


import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * Created by deepali on 24-08-2016.
 */
public class MaxValueofArray {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = new Integer(100);
        int n = new Integer(200);
        int[] a = new int[1000];
        int d = 0;
        String line;
        Set<Integer> set = new HashSet<Integer>();
        t = Integer.parseInt(sc.readLine());
        while (t > 0) {
            n = Integer.parseInt(sc.readLine());
            int i = 0;
            String str = sc.readLine();
            String[] strarray = str.split(" ");
            for (String st : strarray) {
                a[i] = Integer.parseInt(st);
                i++;
            }

            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    set.add(Math.abs(((a[j] - j) - (a[k] - k))));

                }
            }
            t--;
            System.out.println(Collections.max(set));
        }

    }
}
/*Max value
array      Amazon
In a given array A find the maximum value of |Ai – i| – |Aj – j| where i is not equal to j.

Input:

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of an integer N, where N is the size of array.The second line of each test case contains N space separated integers denoting array elements.

Output:

Corresponding to each test case, in a new line, print the maximum value.

Constraints:

1 ? T ? 100
1 ? N ? 200
1 ? A[i] ? 1000

Example:

Input
1
5
9 15 4 12 13

Output
12

Explanation
a[1]-1 - a[2]-2 = (15-1)-(4-2) = 12*/