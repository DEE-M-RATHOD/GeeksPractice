package geeksforgeeks.amazon.school.FullProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by erdee on 18-01-2017.
 */
/*
* Maths Amazon
* Given coordinates of four points in a plane, find if the four points form a square or not.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains 4 space separated integer points a , b , c , d

Output:
For each test case print 1 if the four points form a square else print 0.
Remember to output the answer of each test case in a new line.

Constraints:
1<=T<=100
1<=a,b,c,d<=100

Example:

Input:
2
20 20 20 10 10 20 10 10
10 10 10 10 20 10 20 30

Output:
1
0*/
/*
* To check for square, we need to check for following.
a) All fours sides formed by points are same.
b) The angle between any two sides is 90 degree. (This condition is required as Quadrilateral also has same sides. */
//----------------------------------------------------------------
/*
* The idea is to pick any point and calculate its distance from rest of the points. Let the picked picked point be ‘p’. To form a square, distance of two points must be same from ‘p’, let this distance be d. The distance from one point must be different from that d and must be equal to √2 times d. Let this point with different distance be ‘q’.
The above condition is not good enough as the the point with different distance can be on the other side. We also need to check that q is at same distance from 2 other points and this distance is same as d.*/

/*
* // A C++ program to check if four given points form a square or not.
#include<iostream>
using namespace std;

// Structure of a point in 2D space
struct Point
{
    int x, y;
};

// A utility function to find square of distance
// from point 'p' to poitn 'q'
int distSq(Point p, Point q)
{
    return (p.x - q.x)*(p.x - q.x) +
           (p.y - q.y)*(p.y - q.y);
}

// This function returns true if (p1, p2, p3, p4) form a
// square, otherwise false
bool isSquare(Point p1, Point p2, Point p3, Point p4)
{
    int d2 = distSq(p1, p2);  // from p1 to p2
    int d3 = distSq(p1, p3);  // from p1 to p3
    int d4 = distSq(p1, p4);  // from p1 to p4

    // If lengths if (p1, p2) and (p1, p3) are same, then
    // following conditions must met to form a square.
    // 1) Square of length of (p1, p4) is same as twice
    //    the square of (p1, p2)
    // 2) p4 is at same distance from p2 and p3
    if (d2 == d3 && 2*d2 == d4)
    {
        int d = distSq(p2, p4);
        return (d == distSq(p3, p4) && d == d2);
    }

    // The below two cases are similar to above case
    if (d3 == d4 && 2*d3 == d2)
    {
        int d = distSq(p2, p3);
        return (d == distSq(p2, p4) && d == d3);
    }
    if (d2 == d4 && 2*d2 == d3)
    {
        int d = distSq(p2, p3);
        return (d == distSq(p3, p4) && d == d2);
    }

    return false;
}

// Driver program to test above function
int main()
{
    Point p1 = {20, 10}, p2 = {10, 20},
          p3 = {20, 20}, p4 = {10, 10};
    isSquare(p1, p2, p3, p4)? cout << "Yes": cout << "No";
    return 0;
}
* */
public class CheckIfGivenFourPointsFormASquare {

    /* SOLUTION 1
Correct
Execution Time:0.447*/
    /*
public static void main (String[] args) {
        //code
        int[] a = new int[8];
        int flag1;
        int flag2;
        int flag3;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){flag2 =0;flag1 =0;flag3=0;
            for(int j=0;j<8;j++){
                a[j] = sc.nextInt();
            }
            for(int j=0;j<8;j+=2){
                if(a[j]!=a[j+1]){
                    for(int k=0;k<8;k+=2){
                        if(a[k]==a[k+1] && (a[k] == a[j] || a[k] == a[j+1])){
                            flag1++;
                        }
                    }
                    for(int k=0;k<8;k+=2){
                        if(a[k]==a[j+1] && a[k+1]==a[j]){
                            flag2++;
                        }
                    }
                    flag3=1;
                    if(flag1 == 2 && flag2 ==1){System.out.println(1);}
                    else System.out.println(0);
                    break;
                }
            }
            if(flag1 == 0 && flag2 ==0 &&flag3==0){System.out.println(0);}
        }
    }
*/
        // ----------------------------------------------------------------------------------
    /* SOLUTION 2
    * 0.71 eXECUTION TIME
    * /
 /*   public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //code
        int t =sc.nextInt();
        Point[] p = new Point[4];
        for(int i=0;i<t;i++){
            for(int j=0;j<4;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                p[j] = new Point(x,y);
            }
            checkIfSquareOrNot(p);
        }
    }
    private static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void checkIfSquareOrNot(Point[] p){
        double[] dist = new double[3];
        boolean flag=false;
        Point p1 = p[0];
        for(int i = 1;i<4;i++){
            int result = (int)Math.pow(p1.x-p[i].x,2) + (int) Math.pow(p1.y-p[i].y,2);
            dist[i-1] = Math.sqrt(result);
        }

        if(dist[0]==dist[1]){
            int third = (int) Math.pow(dist[0],2) + (int) Math.pow(dist[1],2);
            if(Math.sqrt(third)==dist[2]){
                flag=true;
            }
        }
        if(dist[1]==dist[2]){
            if(flag==false){
                int third = (int) Math.pow(dist[1],2) + (int) Math.pow(dist[2],2);
                if(Math.sqrt(third)==dist[0]){
                    flag=true;
                }
            }
        }
        if(dist[0]==dist[2]){
            if(flag==false){
                int third = (int) Math.pow(dist[0],2) + (int) Math.pow(dist[2],2);
                if(Math.sqrt(third)==dist[1]){
                    flag=true;
                }
            }
        }
        if(flag){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }*/
    //---------------------------------------------------------------------------------------------------------
    /*
    * SOLUTION 3
    * Correct
Execution Time:0.971
    * */
/*

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());

        for(int i=0; i<numTestCases;i++) {
            String testCase = in.nextLine();
            System.out.println(isSquare(parseTestCase(testCase)));
        }
    }

    private static ArrayList<Point> parseTestCase(String testCase) {

        ArrayList<Point> points = new ArrayList<>();
        String [] testString = testCase.split(" ");

        for(int i=0; i<testString.length-1;i+=2) {
            int x = Integer.parseInt(testString[i]);
            int y = Integer.parseInt(testString[i+1]);
            points.add(new Point(x,y));
        }

        return points;
    }

    private static int isSquare(ArrayList<Point> points) {

        Collections.sort(points, new Comparator<Point>() {
            public int compare(Point a, Point b) {
                return (a.x-b.x)+(a.y-b.y);
            }
        });

        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);
        Point d = points.get(3);


        int disAB = a.distTo(b);
        int disAC = a.distTo(c);
        int disAD = a.distTo(d);


        //First Angle ABC
        Point ab = new Point(b.x-a.x,b.y-a.y);
        Point ac = new Point(a.x-c.x,a.y-c.y);

        double angleAB = Math.atan2(ab.y, ab.x);
        double angleAC = Math.atan2(ac.y, ac.x);
        double angleRes = angleAB - angleAC;
        double angleABC = (angleRes * 180) / Math.PI;

        //Second Angle DCB
        Point dc = new Point(d.x-c.x,d.y-c.y);
        Point db = new Point(d.x-b.x,d.y-b.y);

        double angleDC = Math.atan2(dc.y, dc.x);
        double angleDB = Math.atan2(db.y, db.x);
        double angleResDCB = angleDC - angleDB;
        double angleDCB = (angleResDCB * 180) / Math.PI;


        if(Double.compare(Math.abs(angleABC),90.0) != 0  || Double.compare(Math.abs(angleDCB),90.0) != 0)
            return 0;
        else if(disAB == disAC && 2*disAB == disAD)
            return 1;

        return 0;
    }


    private static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int distTo(Point a) {
            int x2 = a.x;
            int y2 = a.y;
            int dx = (x2-this.x)*(x2-this.x);
            int dy = (y2-this.y)*(y2-this.y);
            return dx+dy;
        }

        public String toString() {
            return "("+x+","+y+")";
        }
    }
*/
    //---------------------------------------------------------------------------------------------------------
    /*
    * SOLUTION 4
    * Correct
Execution Time:0.434
    * */
    /*public static void main (String[] args) {


        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();

        while(t>=1)
        {

            int x[]=new int[4];
            int y[]=new int[4];

		*//*
		for(int i=0;i<4;i++)
		{
			x[i]=obj.nextInt();
			y[i]=obj.nextInt();
		}

		double d1=Math.sqrt(((x[2]-x[0])*(x[2]-x[0]))+((y[2]-y[0])*(y[2]-y[0])));
		double d2=Math.sqrt(((x[1]-x[3])*(x[1]-x[3]))+((y[1]-y[3])*(y[1]-y[3])));

		if(d1==d2)
			System.out.println(1);

		else
			System.out.println(0);

			*//*

            //second method

            for(int i=0;i<4;i++)
            {
                x[i]=obj.nextInt();
                y[i]=obj.nextInt();
            }

            double a=getdistance(x[0],y[0],x[1],y[1]);
            double b=getdistance(x[0],y[0],x[2],y[2]);
            double c=getdistance(x[0],y[0],x[3],y[3]);


            if(b==a*2&&a==c)
            {
                if(getdistance(x[2],y[2],x[1],y[1])==getdistance(x[2],y[2],x[3],y[3]))
                    System.out.println(1);
                else
                    System.out.println(0);
            }

            else if(a==b*2&&b==c)

            {


                if(getdistance(x[1],y[1],x[2],y[2])==getdistance(x[1],y[1],x[2],y[2]))
                    System.out.println(1);
                else
                    System.out.println(0);


            }

            else if(c==a*2&&b==a)
            {
                if(getdistance(x[3],y[3],x[1],y[1])==getdistance(x[2],y[2],x[3],y[3]))
                    System.out.println(1);
                else
                    System.out.println(0);


            }

            else
                System.out.println(0);

            t--;
        }



    }

    static double getdistance(int x1,int y1,int x2,int y2)
    {
        double x=Math.abs(x1-x2);
        x*=x;

        double y=Math.abs(y2-y1);
        y*=y;

        return (x+y);



    }
*/
//---------------------------------------------------------------------------------------------------------
    /*
    * SOLUTION 5
    * Correct
Execution Time:0.463
    * */


//---------------------------------------------------------------------------------------------------------

}

