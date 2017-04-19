package HackerRank.TenDaysOfStatistics.Day0;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by deepali on 16-09-2016.
 */
public class WeightedMean {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.#");
        format.setMaximumFractionDigits(1);
        format.setMinimumFractionDigits(1);
        Scanner sc = new Scanner(System.in);
        int N, X[], W[], total = 0, sumofW = 0;
        double weightedMean = 0;
        N = sc.nextInt();
        X = new int[N];
        W = new int[N];
        if (N >= 5 && N <= 50) {
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
                if (X[i] > 0 && X[i] <= 100) {
                    continue;
                }
            }
            for (int j = 0; j < N; j++) {
                W[j] = sc.nextInt();
                if (W[j] > 0 && W[j] <= 100) {
                    sumofW += W[j];
                    continue;
                }
            }
        }

        for (int a = 0; a < N; a++) {
            total += X[a] * W[a];


        }
        weightedMean = total / Math.ceil(sumofW);
        System.out.println(format.format(weightedMean));

    }

}
