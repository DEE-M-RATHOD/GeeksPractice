package HackerRank.TenDaysOfStatistics.Day1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by deepali on 18-09-2016.
 */
public class InterquartileRange {
    public static void main(String[] args) {

        BigDecimal bd;
        int n, x[], f[], sum = 0, temp[], b = 0;
        double q1 = 0, q3 = 0, iqr = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        f = new int[n];

        if (n >= 5 && n <= 50) {
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                if (x[i] > 0 && x[i] <= 100) {
                    continue;
                }
            }
            for (int j = 0; j < n; j++) {
                f[j] = sc.nextInt();
                if (f[j] > 0 && f[j] <= 100) {
                    sum += f[j];
                    continue;
                }
            }
        }
        temp = new int[sum];
        for (int a = 0; a < n; a++) {
            for (int k = 0; k < f[a]; k++) {
                temp[b] = x[a];
                b++;
            }
        }
        Arrays.sort(temp);
        q1 = calculateMedian(temp, 0, temp.length / 2);
        if (temp.length % 2 == 0) {
            q3 = calculateMedian(temp, (temp.length / 2) + 1, temp.length);
        } else {
            q3 = calculateMedian(temp, (temp.length / 2), temp.length);
        }
        iqr = q3 - q1;
        bd = new BigDecimal(iqr).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(bd.doubleValue());
    }

    private static double calculateMedian(int[] temp, int start, int end) {
        int quartileRange[], middle = 0, d = 0;
        double median = 0;
        quartileRange = new int[Math.abs(end - start)];
        middle = quartileRange.length / 2;
        for (int b = start; b < end; b++) {
            quartileRange[d] = temp[b];
            d++;
        }
        if (temp.length % 2 == 0) {
            median = Math.ceil(quartileRange[middle - 1] + quartileRange[middle]) / 2;
            ;
        } else {
            median = quartileRange[middle];
        }
        return median;
    }
}
