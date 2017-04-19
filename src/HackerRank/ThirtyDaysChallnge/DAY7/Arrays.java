package HackerRank.ThirtyDaysChallnge.DAY7;

import java.util.Scanner;

/**
 * Created by deepali on 25-09-2016.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 1 && n <= 1000) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if(arr[i] >=1 && arr[i] <= 10000){
                    continue;
                }
            }
            for(int j = n-1; j >= 0; j--){
                System.out.print(arr[j] + " ");
            }
        }
        in.close();
    }
}
