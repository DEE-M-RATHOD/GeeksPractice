package geeksforgeeks.amazon.school.FullProblems;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by erdee on 31-01-2017.
 */
/*Array Amazon*/
/*
* Given an integer array, for each element in the array check whether there exist a smaller element on the next immediate position of the array. If it exist print the smaller element. If there is no smaller element on the immediate next to the element then print -1.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case contains an integer N, where N is the size of array.
The second line of each test case contains N integers sperated with a space which is input for the array arr[ ]

Output:

For each test case, print in a newline the next immediate smaller elements for each element in the array.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 500
1 ≤ arr[i] ≤ 1000

Example:

Input
2
5
4 2 1 5 3
6
5 6 2 3 1 7

Output
2 1 -1 3 -1
-1 2 -1 1 -1 -1
* */


public class ImmediateSmallerElement {
        /* SOLUTION 1
       Execution Time:0.739*/
/*
    public static int[] findImmediateSmaller(int[] arr, int n) {
        int[] immediateSmallArray = new int[500];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                immediateSmallArray[i] = arr[i + 1];
            } else {
                immediateSmallArray[i] = -1;
            }
        }
        immediateSmallArray[n - 1] = -1;

        return immediateSmallArray;
    }

    public static void main(String[] args) {

        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[500];

        while (t > 0) {


            int arr_size = sc.nextInt();
            for (int i = 0; i < arr_size; i++) {
                arr[i] = sc.nextInt();
            }

            int[] result = findImmediateSmaller(arr, arr_size);
            for (int i = 0; i < arr_size; i++) {
                if (i != 0)
                    System.out.print(" ");
                System.out.print(result[i]);
            }
            System.out.print("\n");

            t--;
        }
    }*/
    //----------------------------------------------------------------------------------------
   /* SOLUTION 2
       Execution Time:0.59--0.61-0.71- 0.9*/
/*
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int k=0; k<t; k++)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            // int a[] = new int[n];
            for(int i=0; i<n; i++)
            {
                arr.add(sc.nextInt());
                //a[i] = sc.nextInt();
            }
            for(int i=0; i<n-1; i++)
            {
                if(arr.get(i) > arr.get(i+1))
                    System.out.print(arr.get(i+1)+ " ");
                else
                    System.out.print(-1 + " ");
            }
            System.out.println(-1);
            //code
        }
    }*/
    //----------------------------------------------------------------------------------------
   /* SOLUTION 3
       Execution Time:0.594--0.648- 0.9*/
/*
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int noOfTests = scanner.nextInt();
        for (int i = 0; i < noOfTests; i++) {
            int length = scanner.nextInt();
            int [] input = new int[length];
            for (int j = 0; j < length; j++) {
                input[j] = scanner.nextInt();
            }
            printImmediateSmallerElement(input, length);
        }
    }

    public static void printImmediateSmallerElement(int[] input, int size) {
        for (int i = 0; i < size; i++) {
            int res = (i + 1 == size || input[i + 1] >= input[i]) ? -1 : input[i + 1];
            System.out.print(res + " ");
        }
        System.out.println("");
    }*/
    //----------------------------------------------------------------------------------------
   /* SOLUTION 4
       Execution Time:constant in range of 0.6*/
/*
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int T = sc.nextInt();
            while(T-->0){
                int N = sc.nextInt();
                int[] input = new int[N];
                for(int i=0;i<N;i++){
                    input[i] = sc.nextInt();
                }
                print(input);
            }
        }

    public static void print(int[] input){
        for(int i=1;i<input.length;i++){
            if(input[i]<input[i-1]){
                System.out.print(input[i]+" ");
            }else{
                System.out.print(-1+" ");
            }
        }
        System.out.print("-1");
        System.out.println();
    }
*/
}

