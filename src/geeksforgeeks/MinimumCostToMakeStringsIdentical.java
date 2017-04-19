package geeksforgeeks;

/**
 * Created by deepali on 27-08-2016.
 */
public class MinimumCostToMakeStringsIdentical {
    public static void main(String[] args) {
        char X[] = {'a', 'b', 'c', 'd'};
        char Y[] = {'a', 'c', 'd', 'b'};
        System.out.println("Minimum Cost to make two strings identical is = " + findMinCost(X, Y, 10, 20));
    }

    private static int findMinCost(char[] x, char[] y, int costX, int costy) {
        int lengthX = x.length, lengthY = y.length;
        int len_lcs = lcs(x, y, lengthX, lengthY);
        return costX * (lengthX - len_lcs) + costy * (lengthY - len_lcs);
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
* Given two strings X and Y, and two values costX and costY. We need to find minimum cost required to make the given two strings identical. We can delete characters from both the strings. The cost of deleting a character from string X is costX and from Y is costY. Cost of removing all characters from a string is same.

Examples:

Input :  X = "abcd", Y = "acdb", costX = 10, costY = 20.
Output:  30
For Making both strings identical we have to delete
character 'b' from both the string, hence cost will
be = 10 + 20 = 30.

Input :  X = "ef", Y = "gh", costX = 10, costY = 20.
Output:  60
For making both strings identical, we have to delete 2-2
characters from both the strings, hence cost will be =
 10 + 10 + 20 + 20 = 60.
We strongly recommend you to minimize your browser and try this yourself first.

This problem is a variation of Longest Common Subsequence ( LCS ). The idea is simple, we first find the length of longest common subsequence of strings X and Y. Now subtracting len_LCS with lengths of individual strings gives us number of characters to be removed to make them identical.*/