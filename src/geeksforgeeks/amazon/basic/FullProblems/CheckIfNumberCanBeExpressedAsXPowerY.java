package geeksforgeeks.amazon.basic.FullProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by erdee on 16-02-2017.
 */
/*
maths Housing.com amazon*/
/*Given a positive integer n, find if it can be expressed as xy where y > 1 and x > 0 and x and y both are both integers.

        Input:
        The first line of input contains an integer T denoting the no of test cases. Then T test cases follow . Each test cases contains an integer N.

        Output:
        For each test case in a new line print 1 if the number can be expressed as  xy else print 0.

        Constraints:
        1<=T<=1000
        1<=n<=100

        Example:
        Input:
        2
        8
        5
        Output:
        1
        0*//*
Input:  n = 8
        Output: true
        8 can be expressed as 23

        Input:  n = 49
        Output: true
        49 can be expressed as 72

        Input:  n = 48
        Output: false
        48 can't be expressed as xy

        We strongly recommend you to minimize your browser and try this yourself first.

        The idea is simple try all numbers x starting from 2 to square root of n (given number). For every x, try x^y where y starts from 2 and increases one by one until either x^y becomes n or greater than n.

        Below is C++ implementation of above idea.
// C++ program to check if a given number can be expressed
// as power
        #include <bits/stdc++.h>
        using namespace std;

// Returns true if n can be written as x^y
        bool isPower(unsigned n)
        {
        if (n==1)  return true;

        // Try all numbers from 2 to sqrt(n) as base
        for (int x=2; x<=sqrt(n); x++)
        {
        unsigned y = 2;
        unsigned p = pow(x, y);


        // Keep increasing y while power 'p' is smaller
        // than n.
        while (p<=n && p>0)
        {
        if (p==n)
        return true;
        y++;
        p = pow(x, y);
        }
        }
        return false;
        }

// Driver Program
        int main()
        {
        for (int i =2; i<100; i++)
        if (isPower(i))
        cout << i << "  ";
        return 0;
        }

        Output:

        4 8 9 16 25 27 32 36 49 64 81

        One optimization in above solution is to avoid call to pow() by multiplying p with x one by one.
// C++ program to check if a given number can be expressed
// as power
        #include <bits/stdc++.h>
        using namespace std;

// Returns true if n can be written as x^y
        bool isPower(unsigned int n)
        {
        // Base case
        if (n <= 1) return true;

        // Try all numbers from 2 to sqrt(n) as base
        for (int x=2; x<=sqrt(n); x++)
        {
        unsigned  p = x;

        // Keep multiplying p with x while is smaller
        // than or equal to x
        while (p <= n)
        {
        p *= x;
        if (p == n)
        return true;
        }
        }
        return false;
        }

// Driver Program
        int main()
        {
        for (int i =2; i<100; i++)
        if (isPower(i))
        cout << i << "  ";
        return 0;
        }

        Output:

        4 8 9 16 25 27 32 36 49 64 81

        This article is contributed by Vaibhav Gupta.*/
public class CheckIfNumberCanBeExpressedAsXPowerY {
       /* SOLUTION 1
       Execution Time:0.432*/

    /*public static void main (String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=0;
        try {
            T = Integer.parseInt(br.readLine());
        } catch (Exception e){}

        while(T-->0){
            int N=0;
            int res=0;
            try {
                N = Integer.parseInt(br.readLine());
            } catch (Exception e){}
            if(N==1){
                res=1;
            }
            else{
                double logN;
                logN = Math.log(N);
                for (int i=1;i<N;i++){
                    double r = logN/(Math.log(i));
                    if(r== (int)r){
                        res=1;
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }*/
    //----------------------------------------------------------------------------------------
       /* SOLUTION 2
       Execution Time:0.438 - 0.58*/
    /*public static void main (String[] args) {

        Scanner sc  = new Scanner(System.in);
        int notest = sc.nextInt();

        for(int x=0;x<notest;x++){
            int found = 1;
            int num = sc.nextInt();

            if(num == 2)
            {
                found = 0;
            }
            else {
                for(int i=2;i<num;i++){
                    found = 1;
                    int n = num;
                    while(n > 1){
                        int md = n%i;
                        if(md != 0){
                            found = 0;
                            break;
                        }
                        n = n/i;
                    }

                    if(found == 1)
                        break;
                }
            }

            System.out.println(found);
        }
    }
 */
//----------------------------------------------------------------------------------------
       /* SOLUTION 3
       Execution Time:0.438 - 0.58 - 0.6*/
/*
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int result[] = new int[n];
            int count = 0;
            while (n-- > 0) {

                long numb = Long.parseLong(br.readLine());
                long temp = numb;
                if (numb == 1)
                    result[count] = 1;
                for (int i = 2; i <= Math.sqrt(numb); i++) {
                    temp = numb;

                    if (temp % i == 0) {
                        while (temp > 1) {
                            if (temp % i == 0)
                                temp = temp / i;
                            else
                                break;
                        }
                        if (temp == 1) {
                            result[count] = 1;
                            break;
                        }

                    }
                }
                count++;
            }
            for (int a : result)
                System.out.println(a);
        }
    }
*/
//----------------------------------------------------------------------------------------
       /* SOLUTION 4
       Execution Time: 0.553 - 0.618*/
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n > 1) {
                boolean flag = false;
                for (int j = 1; j <= n / 2; j++) {
                    for (int k = 0; k <= n / 2; k++) {
                        if (n == Math.pow(j, k)) {

                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println(1);
                        break;
                    }
                }
                if (!flag) {
                    System.out.println(0);
                }
            } else {
                System.out.println(1);
            }
        }
    }
*/
//----------------------------------------------------------------------------------------
       /* SOLUTION 5
       Execution Time: 0.481 - 0.551*/
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int i = 0; i < range; i++) {
            int val = sc.nextInt();
            if (isPowerOfTwo(val)) System.out.println(1);
            else System.out.println(0);
        }
//System.out.println(isPowerOfTwo(8));
    }

    static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        if (n == 1) return true;

        // Try all numbers from 2 to sqrt(n) as base
        for (int x = 2; x <= Math.sqrt(n); x++) {
            int y = 2;
            int p = (int) Math.pow(x, y);

            // Keep increasing y while power 'p' is smaller
            // than n.
            while (p <= n && p > 0) {
                if (p == n)
                    return true;
                y++;
                p = (int) Math.pow(x, y);
            }
        }
        return false;
    }

*/
//----------------------------------------------------------------------------------------
       /* SOLUTION 6
       Execution Time: 0.431 - 0.551- 0.732*/
/*
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        boolean blnFound = false;
        while (t > 0) {
            int n = scanner.nextInt();
            if (n <= 1) {
                res.append("1" + "\n");
                t--;
                continue;
            }
            for (int i = 2; i <= Math.sqrt(n) + 1; ++i) {
                for (int j = 2; j <= Math.sqrt(n) + 1; ++j) {

                    if (Math.pow(i, j) == n) {
                        if (!blnFound) {
                            res.append("1" + "\n");
                            blnFound = true;
                        }

                    }

                }
            }
            if (!blnFound)
                res.append("0" + "\n");
            else
                blnFound = false;


            t--;
        }

        System.out.println(res);
    }
*/
//----------------------------------------------------------------------------------------
       /* SOLUTION 7
       Execution Time: 0.48 - 0.58- 0.692*/
 /*   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            scan.nextLine();
            System.out.println(perform(scan.nextInt()));
        }
    }

    static short perform(int a) {
        if (a == 1) {
            return 1;
        }
        int f = 2;
        int res = -1;
        int limit = (int) Math.sqrt(a);
        for (int i = 2; i <= limit; i++) {
            res = a;
            while (res % f == 0) {
                res = res / f;
            }
            if (res == 1) {
                return 1;
            } else {
                f++;
            }
        }
        return 0;
    }
 */
//----------------------------------------------------------------------------------------
       /* SOLUTION 8
       Execution Time: 0.43 - 0.58- 0.68*//*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println(1);
                continue;
            }
            int isRaised = 0;
            for (int x = 2; x < num; x++) {
                int temp = num;
                while (temp % x == 0) {
                    temp = temp / x;
                    if (temp == 1) {
                        isRaised = 1;
                        break;
                    } else if (temp < 1) {
                        isRaised = 0;
                        break;
                    }

                }
            }
            System.out.println(isRaised);
        }
    }
*/

    //----------------------------------------------------------------------------------------
       /* SOLUTION 8 flctuate output
       Execution Time: 0.43 - 0.58- 0.68*/
    /*static int resolver(int n) {
        if (n == 1)
            return 1;
        for (int i = 2; i < n; i++) {
            int aux = n;
            for (; aux % i == 0; aux = aux / i) {

            }
            if (aux == 1)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            int n = input.nextInt();
            System.out.println(resolver(n));
            t--;
        }
    }
*/

    //----------------------------------------------------------------------------------------
       /* SOLUTION 9
       Execution Time: 0.58- 0.68*/
        /*public static void main (String[] args)
        {
            int t;
            Scanner sc=new Scanner(System.in);
            t=sc.nextInt();
            for(int i=1;i<=t;i++)
            {
                //System.out.println("Enter the no.");
                int n=sc.nextInt();
                if(n==1)
                {
                    System.out.println("1");
                }
                else
                {
                    int flag=0;
                    for(int j=2;j<=Math.abs(Math.sqrt(n));j++)
                    {
                        int x=1;
                        for(int k=1;k<n;k++)
                        {
                            x=j*x;
                            if(x==n)
                            {
                                flag=1;

                            }
                        }
                    }
                    if(flag==1)
                    {

                        System.out.println("1");
                    }
                    else{
                        System.out.println("0");


                    }

                }
            }
        }*/
    public static void main(String[] args) {
        int t;
        boolean flagg = false;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            //System.out.println("Enter the no.");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("1");
            } else {
                int flag = 0;
                for (int j = 2; j <= Math.abs(Math.sqrt(n)); j++) {
                    int p = j;
                    while (p <= n) {

                        p *= j;
                        if (p == n)
                            flag = 1;

                    }

                }
                if (flag == 1) {
                    System.out.println(1);

                } else {
                    System.out.println(0);
                }
            }
        }

    }
}
