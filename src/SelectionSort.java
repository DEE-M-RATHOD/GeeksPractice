/**
 * Created by deepali on 07-03-2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,47,2,8,2,0,-2,3,0};
        System.out.println("before");
        for (int i: arr){
            System.out.println(i +" ");
        }
        selectinSort(arr);
        System.out.println("After");
        for(int i:arr){
            System.out.println(i +" ");
        }
    }

    private static void selectinSort(int[] arr) {
        /*for(int i=0;i<arr.length -1 ;i++){
            int index = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber ;


            }
        }*/

        // /descending
        for(int i= arr.length-1;i>0;i--){
            int index = 0;
            for(int j=1;j<=i;j++){
                if(arr[j]<arr[index]){
                    index = j;

                }
                int smallernumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallernumber;

            }
        }
    }
}
