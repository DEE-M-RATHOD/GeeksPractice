/**
 * Created by deepali on 10-02-2016.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int temp ;
        int reversenumber = 0;

        while (number > 0 ) {
            temp = number % 10;
            reversenumber = reversenumber * 10 + temp;
            number = number / 10;
        }
        System.out.println("REverse no " +reversenumber);
    }
}
