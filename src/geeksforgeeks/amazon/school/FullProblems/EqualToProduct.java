package geeksforgeeks.amazon.school.FullProblems;

import java.util.*;

/**
 * Created by erdee on 31-01-2017.
 */

/*
* Array Amazon*/

/*
* Given an array of integers check whether there are two numbers present with given product.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and a product p.
The second line of each test case contain N number of a[].

Output:
Print Yes if two numbers product is equal to p else No.

Constraints:

1 ≤ T ≤ 51
1 ≤ N ≤ 200
0 ≤ a[] ≤ 1000
1 ≤ pro ≤ 2000000

Example:

Input:

2

5 2

1 2 3 4 5

8 46

5 7 9 22 15 344 92 8

Output:

Yes

No
* */

/*
*
*
Pair with given product | Set 1 (Find if any pair exists)

Given an array and a number x, find if there is a pair with product equal to x.

Examples :

Input : arr[] = {10, 20, 9, 40};
        int x = 400;
Output : Yes

Input : arr[] = {10, 20, 9, 40};
        int x = 190;
Output : No

Input : arr[] = {-10, 20, 9, -40};
        int x = 400;
Output : Yes

Input : arr[] = {-10, 20, 9, 40};
        int x = -400;
Output : Yes

Input : arr[] = {0, 20, 9, 40};
        int x = 0;
Output : Yes

We strongly recommend that you click here and practice it, before moving on to the solution.

Naive approach ( O(n2) ) is to run two loops to consider all possible pairs. For every pair, check if product is equal to x or not.
// A simple C++ program to find if there is a pair
// with given product.
#include<bits/stdc++.h>
using namespace std;

// Returns true if there is a pair in arr[0..n-1]
// with product equal to x.
bool isProduct(int arr[], int n, int x)
{
    // Consider all possible pairs and check for
    // every pair.
    for (int i=0; i<n-1; i++)
       for (int j=i+1; i<n; i++)
          if (arr[i] * arr[j] == x)
              return true;

    return false;
}

// Driver code
int main()
{
    int arr[] = {10, 20, 9, 40};
    int x = 400;
    int n = sizeof(arr)/sizeof(arr[0]);
    isProduct(arr, n, x)? cout << "Yes\n"
                        : cout << "No\n";
    x = 190;
    isProduct(arr, n, x)? cout << "Yes\n"
                        : cout << "No\n";
    return 0;
}*/

public class EqualToProduct {
       /* SOLUTION 1
Correct
Execution Time:0.457*/
    /*
    public static void main (String[] args) {
        int T,N,P,arr[];
        Scanner sc=new Scanner(System.in);

        T=sc.nextInt();
        for(int i=0;i<T;i++){
            N=sc.nextInt();
            P=sc.nextInt();
            arr=new int[N];

            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(findSol(arr,N,P)?"Yes":"No");
        }
    }

    public static boolean findSol(int arr[],int n,int p){
        int low=0,high=n-1,prd;
        while(low<high){
            prd=arr[low]*arr[high];

            if(prd<p)
                low++;
            else if(prd>p)
                high--;
            else
                return true;
        }

        return false;
    }*/
    //----------------------------------------------------------------------------------------
    /* SOLUTION 2
Correct
Execution Time:0.479*/
/*
       public static void main (String[] args) {
           Scanner scan=new Scanner(System.in);
           int t=scan.nextInt();
           for(int i=0;i<t;i++)
           {
               int n=scan.nextInt();
               int k=scan.nextInt();
               int a[]= new int[n];
               for(int j=0;j<n;j++)
               {
                   a[j]=scan.nextInt();
               }
               int flag=0;
               for(int j=0;j<n;j++)
               {
                   for(int l=j+1;l<n;l++)
                   {
                       int ans=a[j]*a[l];
                       if(ans==k)
                       {
                           flag=1;
                           break;
                       }
                   }
               }
               if(flag==1)
                   System.out.println("Yes");
               else
                   System.out.println("No");
           }
       }
*/

    //----------------------------------------------------------------------------------------
    /* SOLUTION 3
Correct
Execution Time:0.463*/
/*
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int value = sc.nextInt();
            int[] input = new int[N];
            for(int i=0;i<N;i++){
                input[i] = sc.nextInt();
            }
            if(doesKeysExist(input,value))
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }

    public static boolean doesKeysExist(int[] input,int value){
        if(input.length==1) return false;

        boolean exists = false;
        Map<Integer,Integer> hashing = new HashMap<Integer,Integer>();
        for(int i:input){
            if(hashing.containsKey(i))
                hashing.put(i,hashing.get(i)+1);
            else
                hashing.put(i,1);
        }

        if(value==0)
            return hashing.containsKey(0);

        for(int i:input){
            if(i!=0 && value%i==0){
                if(value/i==i && hashing.get(i)>1)
                    exists = true;
                else if(value/i!=i && hashing.containsKey(value/i))
                    exists = true;
            }
        }
        return exists;
    }
*/
    //----------------------------------------------------------------------------------------
    /* SOLUTION 4
Correct
Execution Time:0.443*/
/*

    public static void main (String[] args)
    {
        try(Scanner scanner = new Scanner(System.in)){
            int testCases = readInt(scanner);
            while(testCases-- > 0){
                String[] input = scanner.nextLine().split(" ");
                int size   = Integer.parseInt(input[0]);
                int target = Integer.parseInt(input[1]);
                int[] array = readArray(size, scanner);
                System.out.println(isProductPresent(target, array) ? "Yes" : "No");
            }
        }
    }

    private static boolean isProductPresent(int target, int[] array){
        Set<Integer> hashSet = new HashSet<>();
        for(int i : array){
            if(i == 0){
                if(target == 0)
                    return true;
            }
            else{
                if(hashSet.contains(i))
                    return true;
                if(target / i != 0 && target % i == 0){
                    hashSet.add(i);
                    hashSet.add(target / i);
                }
            }
        }
        return false;
    }

    private static int readInt(Scanner scanner){
        return Integer.parseInt(scanner.nextLine());
    }

    private static int[] readArray(int size, Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] array    = new int[size];
        for(int i = 0; i < size; i++)
            array[i] = Integer.parseInt(input[i]);
        return array;
    }

*/
    //----------------------------------------------------------------------------------------
    /* SOLUTION 5
Correct
Execution Time:0.463*/

/*
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int c = 0 ; c < t; c++){
            Set<Integer> set = new HashSet<>();
            int size = scan.nextInt();
            if(size > 0){
                int n = scan.nextInt();
                boolean found = false;
                for(int i = 0; i < size; ++i){
                    set.add(scan.nextInt());
                }
                if(set.contains(1) && set.contains(n)){
                    System.out.println("Yes");
                } else {
                    for(int i = 2; i < n/i; ++i){
                        if(n % i == 0){
                            if(set.contains(i) && set.contains(n/i)){
                                found = true;
                                break;
                            }
                        }
                    }
                    if(found){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }

            }else {
                System.out.println("No");
            }

        }
    }
*/


}
