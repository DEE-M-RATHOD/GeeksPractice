import java.util.Scanner;

/**
 * Created by deepali on 07-03-2016.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        String primenumbers = "";
        System.out.println("enter limit:");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i<=number ;i++ ){
            int counter = 0;
            for (int num = i; num>=1 ;num--){
                if(i % num == 0 ){
                    counter = counter + 1;

                }
            }
                if(counter == 2){
                   primenumbers = primenumbers + i + " ";
                }

        }
        System.out.println("prime numbers" );
        System.out.println(primenumbers);
    }
}
