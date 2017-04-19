import java.util.Scanner;

/**
 * Created by deepali on 06-03-2016.
 */
public class FibonacciWithRecursion {
    public static void main(String[] args) {
        System.out.println("Enter limit");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i<= number; i++){
            System.out.println(fibonacciRecrusion(i) + "");
        }
    }

    private static int fibonacciRecrusion(int number) {
        if(number == 1 || number == 2){
            return 1;

        }
        return  fibonacciRecrusion(number-1) + fibonacciRecrusion(number -2);

    }
}
