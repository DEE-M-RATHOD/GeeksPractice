package geeksforgeeks.amazon.school.FullProblems;

import java.util.Scanner;

/**
 * Created by erdee on 31-01-2017.
 */

/*
*
* Geometic , Maths
 Microsoft , Goldman Sachs , Expedia, Amazon, OATS Systems
* */

/*
*Given two rectangles, find if the given two rectangles overlap or not. A rectangle is denoted by providing the x and y co-ordinates of two points: the left top corner and the right bottom corner of the rectangle.

Note that two rectangles sharing a side are considered overlapping.

Input:

The first integer T denotes the number of test cases. For every test case, there are 2 lines of input. The first line consists of 4 integers: denoting the co-ordinates of the 2 points of the first rectangle. The first integer denotes the x co-ordinate and the second integer denotes the y co-ordinate of the left topmost corner of the first rectangle. The next two integers are the x and y co-ordinates of right bottom corner. Similarly, the second line denotes the cordinates of the two points of the second rectangle.

Output:

For each test case, output (either 1 or 0) denoting whether the 2 rectangles are overlapping. 1 denotes the rectangles overlap whereas 0 denotes the rectangles do not overlap.

Constraints:
1 <= T <= 10
-10000 <= x,y <= 10000

T denotes the number of test cases. x denotes the x co-ordinate and y denotes the y co-ordinate.

Example:

Input:

2
0 10 10 0
5 5 15 0
0 2 1 1
-2 -3 0 2

Output:

1
0
 *  */
/*
* Given two rectangles, find if the given two rectangles overlap or not.

Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates.
l1: Top Left coordinate of first rectangle.
r1: Bottom Right coordinate of first rectangle.
l2: Top Left coordinate of second rectangle.
r2: Bottom Right coordinate of second rectangle.

rectanglesOverlap

We need to write a function bool doOverlap(l1, r1, l2, r2) that returns true if the two given rectangles overlap.

One solution is to one by one pick all points of one rectangle and see if the point lies inside the other rectangle or not. This can be done using the algorithm discussed here.
Following is a simpler approach. Two rectangles do not overlap if one of the following conditions is true.
1) One rectangle is above top edge of other rectangle.
2) One rectangle is on left side of left edge of other rectangle.*/
/*
*
* #include<bits/stdc++.h>

struct Point
{
    int x, y;
};

// Returns true if two rectangles (l1, r1) and (l2, r2) overlap
bool doOverlap(Point l1, Point r1, Point l2, Point r2)
{
    // If one rectangle is on left side of other
    if (l1.x > r2.x || l2.x > r1.x)
        return false;

    // If one rectangle is above other
    if (l1.y < r2.y || l2.y < r1.y)
        return false;

    return true;
}

/* Driver program to test above function */
/*int main()
        {
        Point l1 = {0, 10}, r1 = {10, 0};
        Point l2 = {5, 5}, r2 = {15, 0};
        if (doOverlap(l1, r1, l2, r2))
        printf("Rectangles Overlap");
        else
        printf("Rectangles Don't Overlap");
        return 0;
        }
* */

public class OverLappingRectangles {
   /* SOLUTION 1
Correct
Execution Time:0.434*/
/*   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();

       for(int i=0;i<T;i++){
           int x1=sc.nextInt();
           int y1=sc.nextInt();
           int x2=sc.nextInt();
           int y2=sc.nextInt();
           int x3=sc.nextInt();
           int y3=sc.nextInt();
           int x4=sc.nextInt();
           int y4=sc.nextInt();
           if(((y1-y3)>=(y1-y2))||(y3-y1)>=(y3-y4)||(x1-x2)>=(x4-x3)||(x3-x1)>=(x2-x1)){
               System.out.println("0");

           }
           else{
               System.out.println("1");
           }
       }

   }
   */
//---------------------------------------------------------------------------------------
 /* SOLUTION 2
Correct
Execution Time:0.959*/
   /*public static void main (String[] args) {
       int T,N;
       Point l1,l2,r1,r2;

       Scanner sc=new Scanner(System.in);
       T=sc.nextInt();

       for(int i=0;i<T;i++){
           l1=new Point();
           l2=new Point();
           r1=new Point();
           r2=new Point();

           l1.x=sc.nextInt();
           l1.y=sc.nextInt();
           r1.x=sc.nextInt();
           r1.y=sc.nextInt();

           l2.x=sc.nextInt();
           l2.y=sc.nextInt();
           r2.x=sc.nextInt();
           r2.y=sc.nextInt();

           System.out.println(isOverlapping(l1,r1,l2,r2)?"1":"0");
       }
   }

    public static boolean isOverlapping(Point l1,Point r1,Point l2,Point r2){
        if(r1.x<=l2.x || l1.x>=r2.x)
            return false;

        if(r1.y>=l2.y || l1.y<=r2.y)
            return false;

        return true;
    }

    static class Point{
        int x;
        int y;
    }*/

//---------------------------------------------------------------------------------------
 /* SOLUTION 3
Correct
Execution Time:0.692*/
/*
static class Node {
    int x;
    int y;
    Node() {
        x = 0;
        y = 0;
    }
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Node oneLeftTop = new Node(scanner.nextInt(), scanner.nextInt());
            Node oneRightBottom = new Node(scanner.nextInt(), scanner.nextInt());
            Node twoLeftTop = new Node(scanner.nextInt(), scanner.nextInt());
            Node twoRightBottom = new Node(scanner.nextInt(), scanner.nextInt());
            System.out.println("" + isOverlap(oneLeftTop, oneRightBottom, twoLeftTop, twoRightBottom));
        }
    }

    public static int isOverlap(Node oneLeftTop, Node oneRightBottom, Node twoLeftTop, Node twoRightBottom) {
        int oneTop = oneLeftTop.y;
        int oneLeft = oneLeftTop.x;
        int oneRight = oneRightBottom.x;
        int oneBottom = oneRightBottom.y;
        int twoTop = twoLeftTop.y;
        int twoLeft = twoLeftTop.x;
        int twoRight = twoRightBottom.x;
        int twoBottom = twoRightBottom.y;
        if (oneTop <= twoBottom || twoTop <= oneBottom ||
                oneLeft >= twoRight || oneRight <= twoLeft) {
            return 0;
        }
        return 1;
    }
*/

//---------------------------------------------------------------------------------------
 /* SOLUTION 4
Correct
Execution Time:0.418*/
/*

    private static int numberOfTestCases, xandyCoordinatesOfLeftTopAndRightBottomOfRectangleOne[], xandyCoordinatesOfLeftTopAndRightBottomOfRectangleTwo[];
    private	static int booleanAreRectanglesOverlapping;

    private int getIfRectanglesOverlap(int[] xandyCoordinateOfFirst, int[] xandyCoordinateOfSecond)
    {
        int isOverlapping = 1;

        if(xandyCoordinateOfFirst[0] >= xandyCoordinateOfSecond[2] || xandyCoordinateOfSecond[0] >= xandyCoordinateOfFirst[2] || xandyCoordinateOfFirst[3] >= xandyCoordinateOfSecond[1] || xandyCoordinateOfSecond[3] >= xandyCoordinateOfFirst[1])
        {
            isOverlapping = 0;
        }
        return isOverlapping;
    }

    public static void main(String args[])
    {
        OverLappingRectangles gfg = new OverLappingRectangles();
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of test cases");
        numberOfTestCases = sc.nextInt();

        for(int i = 0; i < numberOfTestCases; i++)
        {
            // System.out.println("Enter the x and y coordinates of left top and rightbottom for the first rectangle");

            xandyCoordinatesOfLeftTopAndRightBottomOfRectangleOne = new int[4];
            for(int j = 0; j < 4; j++)
            {
                xandyCoordinatesOfLeftTopAndRightBottomOfRectangleOne[j] = sc.nextInt();
            }

            // System.out.println("Enter the x and y coordinates of left top and rightbottom for the second rectangle");

            xandyCoordinatesOfLeftTopAndRightBottomOfRectangleTwo = new int[4];
            for(int j = 0; j < 4; j++)
            {
                xandyCoordinatesOfLeftTopAndRightBottomOfRectangleTwo[j] = sc.nextInt();
            }

            booleanAreRectanglesOverlapping = gfg.getIfRectanglesOverlap(xandyCoordinatesOfLeftTopAndRightBottomOfRectangleOne, xandyCoordinatesOfLeftTopAndRightBottomOfRectangleTwo);
            System.out.println(booleanAreRectanglesOverlapping);
        }
    }
*/
//---------------------------------------------------------------------------------------
 /* SOLUTION 5
Correct
Execution Time:0.433*/
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {

            int ax = sc.nextInt();
            int ay = sc.nextInt();
            int bx = sc.nextInt();
            int by = sc.nextInt();
            int cx = sc.nextInt();
            int cy = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();
            //one rectangle to the left of other
            if ((ax >= dx) || (bx <= cx)) System.out.println(0);
                //one rectangle to the top of other
            else if ((ay <= dy) || (by >= cy)) System.out.println(0);
            else System.out.println(1);
        }

    }*/

}