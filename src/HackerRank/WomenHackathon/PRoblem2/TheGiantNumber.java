package HackerRank.WomenHackathon.PRoblem2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by deepali on 16-11-2016.
 */
public class TheGiantNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q;
        ArrayList<Integer> a, x, k = new ArrayList<>();
        n = sc.nextInt();
        a = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            a.add(i, sc.nextInt());
        }

        q = sc.nextInt();
        x = new ArrayList<>(q);
        k = new ArrayList<>(q);

        for (int j = 0; j < q; j++) {
            x.add(j, Integer.parseInt(sc.next()));
            k.add(j, Integer.parseInt(sc.next()));

        }


        for (int d = 0; d < q; d++) {
            int count = 0;

            for (int e = 0; e < a.size(); e++) {
                if (x.get(d) % a.get(e) == 0) {
                    count++;
                }
                if (count == k.get(d)) {

                    System.out.println("Yes");
                    break;

                }
            }
            if (count != k.get(d)) {
                System.out.println("No");
            }
        }


    }
}
/*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 100001;
        int n = sc.nextInt();
        int a[] = new int[h];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            for (int j = 1; j * t < h; j++) {
                a[j * t]++;
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int k = sc.nextInt();
            if (a[x] >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
*/