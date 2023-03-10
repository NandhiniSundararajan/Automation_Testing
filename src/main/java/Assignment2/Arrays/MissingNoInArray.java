package Assignment2.Arrays;

public class MissingNoInArray {

    public static void main(String[] args) {

        /* Given array: int[] a = {1,2,3,4,5,6};
        removing a[3] = 4, the array is modified as follows: */

        int[] a = {1,2,3,5,6};
        int i, total_sum, sum = 0;

        int m = a.length;
        int x = a[m-1];
        total_sum = x * (x+1) / 2;

        for(i=0; i<m; i++) {
            sum = sum + a[i];
        }

        System.out.println("The missing number in the array is: " + (total_sum - sum));

    }
}
