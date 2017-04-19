import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by deepali on 26-05-2016.
 */
public class ChefAndNotebooks_CodeChef {
    public static void main(String[] args) throws Exception {
        MyScanner ms = new MyScanner();
        int testCases = ms.nextInt();

        while ( testCases-- > 0){
            String answer = "unlucky chef";
            /*
           	String input[]=br.readLine().split(" ");
			//System.out.println(input[0]);
			int X=Integer.parseInt(input[0]);    which one is better ? to ask mohit?
			int Y=Integer.parseInt(input[1]);
			int K=Integer.parseInt(input[2]);
			int N=Integer.parseInt(input[3]);*/
            int x = ms.nextInt();
            int y = ms.nextInt();
            int k = ms.nextInt();
            int n = ms.nextInt();

            while (n-- > 0){
                int p = ms.nextInt();
                int c = ms.nextInt();

                if( (c <= k) && (y < x) && (p >= (x-y)) ){ //lucky chef condition
                    answer = "lucky Chef";
                } else if (y == x){
                    answer = "Chef has sufficient pages";
                } else {
                    answer = "unlucky Chef";
                }

            }
            System.out.println(answer);
        }

    }
}

class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
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

}
/*
* Sample

Input
3
3 1 2 2
3 4
2 2
3 3 2 2
2 3
2 3
3 1 2 2
1 1
1 2

Output
LuckyChef
UnluckyChef
UnluckyChef
Explanation

Example case 1. In this case, Chef wants to write X = 3 pages long poetry, but his notebook has only Y = 1 page. And his budget is K = 2 rubles, and there are N = 2 notebooks in the shop. The first notebook has P1 = 3 pages, but Chef cannot buy it, because its price is C1 = 4 rubles. The second notebook has P2 = 2 pages, and its price is C2 = 2 rubles. Thus Chef can select the second notebook to accomplish the task. He will write 1 page of poetry in the old notebook, and 2 page of poetry in the new notebook.
Example case 2. Chef cannot buy any notebook, because the prices exceed the Chef's budget.
Example case 3. No notebook contains sufficient number of pages required to write poetry.*/