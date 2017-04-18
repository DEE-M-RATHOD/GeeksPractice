package geeksforgeeks.amazon.school.FullProblems;

import java.util.Scanner;

/**
 * Created by erdee on 31-01-2017.
 */
/*Maths Amazon*/
/*
* A file contains data as follows( Student name, marks in 3 subjects)
Shrikanth 20 50 60
Kiran 30 80 90
Find the student who has maximum average score.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the number of student.
The second line of each test case contains N input Student name and marks in 3 subject.

Output:

Print the student who has maximum average score and maximum average score(in int).

Constraints:

1 ≤ T ≤ 10
1 ≤ N ≤ 15
1 ≤ s ≤ 10
1 ≤ marks ≤ 100

Example:

Input:
2
2
Shrikanth 20 30 10 Ram 100 50 10
3
Adam 50 10 40 Suresh 22 1 56 Rocky 100 90 10

Output:
Ram 53
Rocky 66

* */
public class StudentRecord {
    /* SOLUTION 1
       Execution Time:0.483*/

    /*   public static void main (String[] args) {
           //code
           Scanner in = new Scanner(System.in);
           int nTest = in.nextInt();
           for(int test = 0; test < nTest; test++) {
               int n = in.nextInt();
               String ret1 = "";
               int ret2 = 0;
               for(int i=0; i<n; i++) {
                   String name = in.next();
                   int n1 = in.nextInt();
                   int n2 = in.nextInt();
                   int n3 = in.nextInt();

                   int avg = (n1+n2+n3)/3;
                   if(avg > ret2) {
                       ret1 = name;
                       ret2 = avg;
                   }
               }
               System.out.println(ret1+" "+ret2);

           }
       }*/
    //----------------------------------------------------------------------------------------
   /* SOLUTION 2
       Execution Time:0.41 -- 0.515*/
/*    public static void main(String[] args) {
        Scanner kv = new Scanner(System.in);
        int t = kv.nextInt();
        for (int test = 0; test < t; test++) {
            int total = kv.nextInt();
            String[] name = new String[total];
            int[] mark = new int[total];
            int m1, m2, m3;
            for (int i = 0; i < total; i++) {
                name[i] = kv.next();
                m1 = kv.nextInt();
                m2 = kv.nextInt();
                m3 = kv.nextInt();
                mark[i] = m1 + m2 + m3;
                //    System.out.println(name[i]+" "+mark[i]);
            }
            int max = mark[0], index = 0;
            for (int j = 0; j < total - 1; j++) {

                if (max > mark[j + 1]) {
                    max = max;

                } else {
                    max = mark[j + 1];
                    index = j + 1;
                }
                // System.out.println(name[index]+" "+mark[index]);
            }
            System.out.println(name[index] + " " + ((int) (mark[index] / 3)));
        }
    }*/
//----------------------------------------------------------------------------------------
   /* SOLUTION 3
       Execution Time:0.41*/
/*
    public static int getAvg(int[] scoreArray) {
        int totalValue = 0;
        for(int x = 0; x < scoreArray.length; x++) {
            totalValue += scoreArray[x];
        }
        return (int)totalValue/scoreArray.length;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();

        while (numTests > 0) {
            int bestAvg = 0;
            String name = "";
            int numStudents = sc.nextInt();

            for (int x = 0; x < numStudents; x++) {
                int[] studentScoreArray = new int[3];
                String studentName = sc.next();
                for (int i = 0; i < 3; i++) {
                    studentScoreArray[i] = sc.nextInt();
                }
                int tempAvg = getAvg(studentScoreArray);
                if (tempAvg > bestAvg) {
                    bestAvg = tempAvg;
                    name = studentName;
                }
            }
            System.out.println(name + " " + String.valueOf(bestAvg));
            numTests--;
        }
    }
*/
//----------------------------------------------------------------------------------------
   /* SOLUTION 4
       Execution Time:0.416*/
    /*public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            String[] s = new String[n];
            for(int j=0;j<n;j++){
                String name = sc.next();
                s[j] = name;
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                int a3 = sc.nextInt();
                arr[j] = (a1 + a2 + a3)/3;
            }
            int max = 0,m=0;
            for(int k=0;k<n;k++){
                if(arr[k]>max){
                    max = arr[k];
                    m = k;
                }
            }
            System.out.print(s[m] + " "+ max);
            System.out.println();
        }
    }*/

    //----------------------------------------------------------------------------------------
   /* SOLUTION 5
       Execution Time:0.405*/
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {

            int studentNum = scanner.nextInt();
            int avgs[] = new int[studentNum];
            String names[] = new String[studentNum];

            for (int j = 0; j < studentNum; j++) {
                String name = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int av = (a + b + c) / 3;
                avgs[j] = av;
                names[j] = name;
            }

            //To find the Greatest Element
            int greatest = 0;
            int index = 0;
            for (int b = 0; b < avgs.length; b++) {
                if (avgs[b] > greatest) {
                    greatest = avgs[b];
                    index = b;
                }
            }

            System.out.println(names[index] + " " + avgs[index]);
        }
    }
*/
    //----------------------------------------------------------------------------------------
   /* SOLUTION 6
       Execution Time:0.634 , 0.415, 0.722*/
/*

    public static void main(String[] args) {
        int totalNumberOfTestCases, numberN;
        float average, maxAverage;

        StringBuilder studentName, finalStudentName = null;

        Scanner sc = new Scanner(System.in);
        totalNumberOfTestCases = sc.nextInt();

        for (int i = 0; i < totalNumberOfTestCases; i++) {
            numberN = sc.nextInt();
            maxAverage = 0;
            for (int j = 0; j < numberN; j++) {
                studentName = new StringBuilder(sc.next());

                average = (float) (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3;

                if (average > maxAverage) {
                    finalStudentName = studentName;
                    maxAverage = average;
                }
            }
            System.out.println(new String(finalStudentName) + " " + (int) maxAverage);
        }
    }
*/

}