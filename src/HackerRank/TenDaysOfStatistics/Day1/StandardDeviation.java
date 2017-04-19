package HackerRank.TenDaysOfStatistics.Day1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by deepali on 18-09-2016.
 */
// 11:55  - 12:15
public class StandardDeviation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x[];
        double sum = 0, mue = 0, temp[], sumofTemp = 0;
        n = sc.nextInt();
        x = new int[n];
        temp = new double[n];

        if (n >= 5 && n <= 100) {
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                if (x[i] >= 0 && x[i] <= 100000) {
                    sum += x[i];
                    continue;
                }
            }
        }
        mue = sum / n;
        for (int j = 0; j < n; j++) {
            temp[j] = ((x[j] - mue) * (x[j] - mue));
            sumofTemp += temp[j];
        }
        System.out.println(new BigDecimal(Math.sqrt(sumofTemp / n)).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue());

    }
}