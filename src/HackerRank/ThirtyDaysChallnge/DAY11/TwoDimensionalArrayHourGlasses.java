package HackerRank.ThirtyDaysChallnge.DAY11;

import java.util.Scanner;
import java.lang.reflect.Proxy;

/**
 * Created by deepali on 06-10-2016.
 */
public class TwoDimensionalArrayHourGlasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int currentSum = 0, maxSum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] <= 9 && arr[i][j] >= -9) {
                    continue;
                }
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                currentSum = arr[k][l] + arr[k][l + 1] + arr[k][l + 2] + arr[k + 1][l + 1] + arr[k + 2][l] + arr[k + 2][l + 1] + arr[k + 2][l + 2];
                if (currentSum < 0) {
                    if ((currentSum) < (maxSum) && l == 0 && k==0 ) {
                        maxSum = currentSum;
                    } else {
                        if (currentSum > maxSum) {
                            maxSum = currentSum;
                        }
                    }
                } else {
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
/*
*    Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        solution(arr);
    }

	private static void solution(int[][] arr){
		List<Integer> sums = new ArrayList<Integer>();
		for(int i=0;i<arr.length-2;i++){
			for(int j=0;j<arr[0].length-2;j++){
				int one = arr[i][j];
				int two = arr[i][j+1];
				int three = arr[i][j+2];
				int four = arr[i+1][j+1];
				int five = arr[i+2][j];
				int six = arr[i+2][j+1];
				int seven = arr[i+2][j+2];
				int sum = one + two + three + four + five + six + seven;
				sums.add(sum);
			}
		}
		Collections.sort(sums);
		System.out.println(sums.get(sums.size()-1));
	}*/