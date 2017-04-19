package HackerRank.TenDaysOfStatistics.Day0;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by deepali on 15-09-2016.
 */
public class MeanMedianMode {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.#");
        format.setMaximumFractionDigits(1);
        int count = 0, middle = 0, N, X[], maxCount = 0, total = 0, mode = 0;
        double median = 0, mean = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = new int[N];

        if (N >= 10 && N <= 2500) {
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
                if (X[i] > 0 && X[i] <= 100000) {
                    continue;
                }
            }
        }
        Arrays.sort(X);
        middle = N / 2;
        for (int candidateMode : X) {
            count = 0;
            total += candidateMode;
            median = Math.ceil(X[middle - 1] + X[middle]) / 2;
            for (int element : X) {
                if (candidateMode == element) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = candidateMode;
            }
        }/*
        for (int j = 0; j < N; j++) {
            count = 0;
            total += X[j];
            median = Math.ceil(X[middle - 1] + X[middle]) / 2;
            for (int k = 0; k < N; k++) {
                if (X[j] == X[k]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = X[j];
            } else {
                mode = X[0];
            }
        }*/

        System.out.println(format.format(total / Math.ceil(N)));
        System.out.println(format.format(median));
        System.out.println(mode);
    }
}
/*
2184
2963
6010
10011
11095
11246
16378
32224
32516
33325
33797
37042
39569
40121
43220
53409
63256
61848
60567
58515
52419
51969
91087
91908
93640
94900
*/
