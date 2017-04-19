import java.lang.*;

/**
 * Created by deepali on 10-02-2016.
 */
public class SwapElementsWithoutThirdVariableExample {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
      /*  int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;
*/
        System.out.println("Before Swapping");
        System.out.println("Value of num1 is :" + number1);
        System.out.println("Value of num2 is :" +number2);

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("after Swapping");
        System.out.println("Value of num1 is :" + number1);
        System.out.println("Value of num2 is :" +number2);

    }
}
