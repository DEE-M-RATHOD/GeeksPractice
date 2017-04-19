package HackerRank.TenDaysOfStatistics.Day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by deepali on 17-09-2016.
 */
public class Quartiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x[], middle = 0, q1, q2, q3;

        n = sc.nextInt();
        x = new int[n];
        middle = n / 2;
        if (n >= 5 && n <= 50) {
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                if (x[i] > 0 && x[i] <= 100) {
                    continue;
                }
            }
        }
        Arrays.sort(x);
        q1 = calculateMedian(x, 0, n / 2);
        System.out.println(q1);

        if (n % 2 == 0) {
            System.out.println((x[middle - 1] + x[middle]) / 2);
            q3 = calculateMedian(x, (n / 2), n);


        } else {
            System.out.println(x[n / 2]);
            q3 = calculateMedian(x, (n / 2)+1, n);

        }

        System.out.println(q3);
    }

    public static int calculateMedian(int[] x, int start, int end) {
        int middle = 0, j = 0;
        int y[] = new int[Math.abs(end - start)];
        for (int i = start; i < end; i++) {
            y[j] = x[i];
            j++;
        }
        middle = y.length / 2;
        if (y.length % 2 == 0) {
            return (y[middle - 1] + y[middle]) / 2;


        } else {
            return y[middle];
        }


    }
}
