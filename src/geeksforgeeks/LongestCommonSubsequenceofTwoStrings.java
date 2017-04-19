package geeksforgeeks;

/**
 * Created by deepali on 27-08-2016.
 */
public class LongestCommonSubsequenceofTwoStrings {
    public static void main(String[] args) {
        /*char X[] = {'a', 'g', 'g', 't', 'a', 'b'};
        char Y[] = {'g', 'x', 't', 'x','a', 'y', 'b'};*/

        char X[] = {'a', 'a', 'b'};
        char Y[] = {'a', 'a', 'c'};
        int lengthX = X.length, lengthY = Y.length;
        System.out.println("Length of LCS = " + lcs(X, Y, lengthX, lengthY));
    }

    private static int lcs(char[] X, char[] Y, int lengthX, int lengthY) {

        if (lengthX == 0 || lengthY == 0)
            return 0;
        if (X[lengthX - 1] == Y[lengthY - 1])
            return 1 + lcs(X, Y, lengthX - 1, lengthY - 1);
        else
            return Math.max(lcs(X, Y, lengthX, lengthY - 1), lcs(X, Y, lengthX - 1, lengthY));
    }

}
/*
* We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively. We also discussed one example problem in Set 3. Let us discuss Longest Common Subsequence (LCS) problem as one more example problem that can be solved using Dynamic Programming.

LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.

It is a classic computer science problem, the basis of diff (a file comparison program that outputs the differences between two files), and has applications in bioinformatics.

Examples:
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.


We strongly recommend that you click here and practice it, before moving on to the solution.


The naive solution for this problem is to generate all subsequences of both given sequences and find the longest matching subsequence. This solution is exponential in term of time complexity. Let us see how this problem possesses both important properties of a Dynamic Programming (DP) Problem.

1) Optimal Substructure:
Let the input sequences be X[0..m-1] and Y[0..n-1] of lengths m and n respectively. And let L(X[0..m-1], Y[0..n-1]) be the length of LCS of the two sequences X and Y. Following is the recursive definition of L(X[0..m-1], Y[0..n-1]).

If last characters of both sequences match (or X[m-1] == Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = 1 + L(X[0..m-2], Y[0..n-2])

If last characters of both sequences do not match (or X[m-1] != Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = MAX ( L(X[0..m-2], Y[0..n-1]), L(X[0..m-1], Y[0..n-2])

Examples:
1) Consider the input strings “AGGTAB” and “GXTXAYB”. Last characters match for the strings. So length of LCS can be written as:
L(“AGGTAB”, “GXTXAYB”) = 1 + L(“AGGTA”, “GXTXAY”)

2) Consider the input strings “ABCDGH” and “AEDFHR. Last characters do not match for the strings. So length of LCS can be written as:
L(“ABCDGH”, “AEDFHR”) = MAX ( L(“ABCDG”, “AEDFHR”), L(“ABCDGH”, “AEDFH”) )

So the LCS problem has optimal substructure property as the main problem can be solved using solutions to subproblems.

2) Overlapping Subproblems:
Following is simple recursive implementation of the LCS problem. The implementation simply follows the recursive structure mentioned above.

C/C++Python
*/