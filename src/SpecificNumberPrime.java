import java.util.Scanner;

/**
 * Created by deepali on 06-03-2016.
 */
public class SpecificNumberPrime {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER");
        int flag=0;
        int number = new Scanner(System.in).nextInt();
        for(int i=2; i<=number/2;i++){
            if (number%i ==0){
                System.out.println("NUNER IS not PRIME:");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("prime");
        }
    }
}
