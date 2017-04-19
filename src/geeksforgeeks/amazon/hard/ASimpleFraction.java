package geeksforgeeks.amazon.hard;

/**
 * Created by erdee on 18-04-2017.
 */
/*A Simple Fraction
hashing  maths              Amazon    Microsoft
* */
/*Given a fraction. Convert it into a decimal. So simple :P

eg.
10/2 = 5
3/5 = 0.6

(The Question Begins Now)  :D
If the decimals are repeating recursively, then enclose them inside  ().

eg.
8/3 = 2.(6)

as 8/3 = 2.66666666.......  infinitly.


Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is an integer N denoting the numerator of fraction.
The second line of each test case is an integer D denoting the denominator of fraction.

Output:

Print decimal of that fraction in separate line for each test case.

Constraints:

1 ≤ T ≤ 100
1 ≤ N,D ≤ 2000

Example:

Input
2
4
2
8
3
Output
2
2.(6)

* */
/*
*
When does the fractional part repeat ?

Lets simulate the process of converting fraction to decimal. Lets look at the part where we have already figured out the integer part which is floor(numerator / denominator).
Now you are left with ( remainder = numerator%denominator ) / denominator.
If you remember the process of converting to decimal, at each step you do the following :

1) multiply the remainder by 10,
2) append remainder / denominator to your decimals
3) remainder = remainder % denominator.

At any moment, if your remainder becomes 0, you are done.

However, there is a problem with recurring decimals. For example if you look at 1/3, the remainder never becomes 0.

Notice one more important thing.
If you start with remainder = R at any point with denominator d, you will always get the same sequence of digits.
So, if your remainder repeats at any point of time, you know that the digits between the last occurrence of R will keep repeating.
So the idea is to store seen remainders in a map. Whenever a remainder repeats, we return the sequence before the next occurrence.*/
public class ASimpleFraction {
}
