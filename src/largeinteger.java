import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by deepali on 16-11-2016.
 */
public class largeinteger {
    public static void main(String[] args) throws IOException {


    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a[] = br.readLine().split(" ");
        int arr[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(a[i]) - 1]++;
        }
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            String b[] = br.readLine().split(" ");
            int x = Integer.parseInt(b[0]);
            int k = Integer.parseInt(b[1]);
            int ans = 0;
            for (int j = 1; j < Math.sqrt(x); j++) {
                if (x % j == 0) {
                    ans += arr[j - 1];
                    ans += arr[x / j - 1];
                }
                if (ans >= k)
                    break;
            }
            int t = (int) Math.sqrt(x);
            if (x == (t * t))
                ans += arr[t - 1];
            if (ans >= k)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}