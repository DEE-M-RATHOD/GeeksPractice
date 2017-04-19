package geeksforgeeks.school;

/**
 * Created by deepali on 24-08-2016.
 */
public class ReverseArrayInGroupsOfSizeK {

    private static int[] loopArray(int[] a, int k) {
        int i;
        int rem = a.length % k; //to fig out if any elements will be left at the end
        for(i = 0; i < a.length ; i = i + k) {
            a = reverseArray(a, i, i+k-1);
        }
        if(rem != 0) {
            reverseArray(a, a.length - rem, a.length - 1);
        }
        return a;
    }

    private static int[] reverseArray(int[] a, int start, int end) {
        int temp, i ,j;
        for(i = start, j = end; i < j && j < a.length ; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}
