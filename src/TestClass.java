/**
 * Created by deepali on 21-05-2016.
 */


// * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


class TestClass {
    public static void main(String args[]) throws Exception {
      /*  Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){

            int count = 0;
            int n = sc.nextInt();
            String st = sc.next();
            char even = st.charAt(0);
            char odd;
            if(even=='B'){
                odd = 'G';
            }
            else{
                odd = 'B';
            }

            for(int j=1; j<2*n; j++){
                if(j%2==1 && odd!=st.charAt(j)){
                    count++;
                }
                if(j%2==0 && even!=st.charAt(j)){
                    count++;
                }
            }

            System.out.println(count/2);

        }
        sc.close();*/
        ModScanner ms=new ModScanner();
        int t=ms.nextInt();
        while(t-->0){
            int type=ms.nextInt();
            if(type==2)
                type=1;
            String s=ms.nextToken();
            int l=0;
            long cost=0,cost1=0;
            int g=0,b=0;
            for(int i=0;i<s.length();i++){
                if(s.toUpperCase().charAt(i)=='B')
                    b++;
                else
                    g++;
            }

            if(Math.abs(b-g)>1)
                System.out.println("-1");
            else{
                if(b>=g){
                    l=0;
                    int[] ber=new int[100001];
                    int[] ger=new int[100001];
                    for(int i=0;i<s.length();i+=2){
                        if(s.toUpperCase().charAt(i)=='G'){
                            ger[l]=i;
                            l++;
                        }
                    }
                    l=0;
                    for(int i=1;i<s.length();i+=2){
                        if(s.toUpperCase().charAt(i)=='B'){
                            ber[l]=i;
                            l++;
                        }
                    }
                    for(int i=0;i<l;i++)
                        cost+=(long)Math.pow(Math.abs(ber[i]-ger[i]),type);
                }
                if(b<=g){
                    int[] ber1=new int[100001];
                    int[] ger1=new int[100001];
                    l=0;
                    for(int i=0;i<s.length();i+=2){
                        if(s.toUpperCase().charAt(i)=='B'){
                            ber1[l]=i;
                            l++;
                        }
                    }
                    l=0;
                    for(int i=1;i<s.length();i+=2){
                        if(s.toUpperCase().charAt(i)=='G'){
                            ger1[l]=i;
                            l++;
                        }
                    }
                    for(int i=0;i<l;i++)
                        cost1+=(long)Math.pow(Math.abs(ber1[i]-ger1[i]),type);
                }
                if(b>g)
                    System.out.println(cost);
                else if(b<g)
                    System.out.println(cost1);
                else
                    System.out.println(cost<cost1?cost:cost1);
            }
        }

    }

    }

class ModScanner {
    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
    }
/*
* Input:
8
0
BB
0
BG
0
BBGG
1
BGG
1
BGGB
1
BBBGG
2
BBGG
2
BGB

Output:
-1
0
1
1
1
3
1
0

* */
/*
* Explanation

Note type of the first 3 test cases is 0. So c(i, j) = 1. Hence we just have to count minimum number of swaps needed.
Example case 1. There is no way to make sure that both the boys does not stand nearby. So answer is -1.
Example case 2. Arrangement is already valid. No swap is needed. So answer is 0.
Example case 3. Swap boy at position 1 with girl at position 2. After swap the arrangement will be BGBG which is a valid arrangement. So answer is 1.
Now type of the next 3 test cases is 1. So c(i, j) = |j ? i|, that is, the absolute value of the difference between i and j.
Example case 4. Swap boy at position 0 with girl at position 1. After swap the arrangement will be GBG which is a valid arrangement. So answer is |1 - 0| = 1.
Example case 5. Swap boy at position 0 with girl at position 1. After swap the arrangement will be GBGB which is a valid arrangement. So answer is |1 - 0| = 1.
Example case 6. Swap boy at position 1 with girl at position 4. After swap the arrangement will be BGBGB which is a valid arrangement. So answer is |4 - 1| = 3.
Then type of the last 2 test cases is 2. So c(i, j) = (j ? i)2
Example case 7. Swap boy at position 1 with girl at position 2. After swap the arrangement will be BGBG which is a valid arrangement. So answer is (2 - 1)2 = 1.
Example case 8. Arrangement is already valid. No swap is needed. So answer is 0.
*/