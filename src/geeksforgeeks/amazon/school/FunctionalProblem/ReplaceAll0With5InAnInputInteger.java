package geeksforgeeks.amazon.school.FunctionalProblem;

import java.util.Scanner;

/**
 * Created by erdee on 18-01-2017.
 */
/*
* Array Amazon
Source: Amazon interview Experience | Set 136 (For SDE-T)
ARRAY

Given a number your task is to complete the function convertFive which replace all zeros in the number with 5 and returns the number.

Input:
The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains a single integer N denoting the number.

Output:
The output of the function will be an integer where all zero's are converted to 5 .

Constraints:
1<=T<100
1<=N<=10000

Example:
Input
2
1004
121

Ouput
1554
121

* */
/*---------------------------------------------------------------------------------------------------------------------*/
/*
* The idea is simple, we get the last digit using mod operator ‘%’. If the digit is 0, we replace it with 5, otherwise keep it as it is. Then we recur for remaining digits.
* */
/*---------------------------------------------------------------------------------------------------------------*/



public class ReplaceAll0With5InAnInputInteger {

    //SOLUTION - 1
    public static int convertFive(int n){
        if(n == 0){
            return 0;
        }
        int digit = n % 10;
        if (digit == 0)
            digit = 5;

        // Convert remaining digits and append the last digit
        return convertFive(n/10) * 10 + digit;

//        Correct
 //       Execution Time:0.486
    }

    //-----------------------------------------------------------------------------------------
    //SOLUTION - 2

    /*
    * 	public static void convertFive(int n){
    String number = "";
    int temp = 0;
    while(n!=0) {
        temp = n % 10;
        temp = temp == 0 ? 5:temp;
        number = temp + number;
        n = n / 10;
    }
    System.out.println(number);
//Execution Time:1.013

Execution Time:0.727
}
    * */
//-------------------------------------------------------------------------------------

    //SOLUTION -3
 /*
 * 	public static void convertFive(int n){
		String s=Integer.toString(n);
		//s.replaceAll("0", "5");
		System.out.println(s.replaceAll("0", "5"));
	}

	public static void main(String[] args) {

		Scanner S=new Scanner(System.in);

		int test=S.nextInt();
		int []num=new int[test];
		for(int step=0;step<test;step++){
			num[step]=S.nextInt();
		}

		for(int step=0;step<test;step++){
			convertFive(num[step]);
		}
Execution Time:0.484	}
*/
//-------------------------------------------------------------------------------------

    //SOLUTION -4
/*
* 	public static void convertFive(int n){
//add code here.


        int num=0,count=1;
        while(n>0){
            int x=n%10;
            if(x==0)
            x=5;
            num=(x)*(int)Math.pow(10,count-1)+num;
            n=n/10;
            count++;
        }
        System.out.println(num);
	}
	Correct
Execution Time:0.768
	*/
//-------------------------------------------------------------------------------------

    //SOLUTION -5
    /*
    * 	public static int convertFive(int n){
        int digit = 5;
        int new_num = n;
        if(n == 0){
        	return 5;
        }
        while (n > 0){
            if (n%10 == 0){
                new_num = new_num + digit;
            }
            n = n/10;
            digit = digit*10;

        }
        return new_num;
    }

public static void main (String[] args)
    {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // One by one run for all input test cases
        while (t > 0)
        {
            // Input the number to be tested
            int n = sc.nextInt();

            // Compute and print result
            System.out.println(convertFive(n));

            t--;
        }
    }

    Execution Time:0.473
    * */
//-------------------------------------------------------------------------------------

    //SOLUTION -6

    /*
    * 	public static void convertFive(int n){
  int newN=n;
        int c=0;
        int add=0;
        while(n>1){
        int mod=n%10;
        if(mod==0){
            add=add+5*(int)Math.pow(10, c);
            c++;
        }else{
            c++;
        }
        n=n/10;
        }
     System.out.println(newN+add);
}

//Correct
//Execution Time:1.141*/
//-------------------------------------------------------------------------------------

    //SOLUTION -7
    /*
* static int convert(int number, int pow) {
        int result = 0;
        int rest = number;
        while (pow >= 1) {
            int div = rest / pow;
            rest = rest % pow;
            if (div == 0) {
                result += 5*pow;
            } else {
                result += div * pow;
            }
            pow = pow / 10;
        }
        System.out.println(result);
        return result;
    }

	public static int convertFive(int n){
        if (n >= 10000) {
            return convert(n, 10000);
        }
        if (n >= 1000) {
            return convert(n, 1000);
        }
        if (n >= 100) {
            return convert(n, 100);
        }
        if (n >= 10) {
            return convert(n, 10);
        }
        return convert(n, 1);
    }
}

//Correct
//Execution Time:0.727
* */
//-------------------------------------------------------------------------------------

    //SOLUTION -8

/*
* 	public static void convertFive(int n){

int value = n;
		    String s = Integer.toString(value);
		    s = s.replaceAll("0", "5");
		    System.out.println(Integer.parseInt(s));
}
}

//Correct
//Execution Time:0.749*/
//-------------------------------------------------------------------------------------

    //SOLUTION -9


/*
* public static void convertFive(int n){
        String str=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++ ){
            if(str.charAt(i)=='0')
                sb.append('5');
            else
                sb.append(str.charAt(i));
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}

//Correct
//Execution Time:0.749
//*/
    public static void main(String[] args) {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // One by one run for all input test cases
        while (t > 0) {
            // Input the number to be tested
            int n = sc.nextInt();

            // Compute and print result
            System.out.println(convertFive(n));

            t--;
        }
    }
}
/*
Result:


        Correct
        Execution Time:0.473

}
*/