import java.util.Scanner;

/**
 * Created by deepali on 06-03-2016.
 */
public class FibonicciWithLoopIteration {
    public static void main(String[] args) {
        System.out.println("Enter limit:");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1 ; i<= number; i++){
            System.out.println(fibonicciLoop(i));
        }
    }

    private static int fibonicciLoop(int number) {
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1 = 1, fibo2= 1, fibosum =1;
        for (int i =3 ; i<=number ; i++){
            fibosum = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibosum;

        }
        return fibosum;
    }

}
