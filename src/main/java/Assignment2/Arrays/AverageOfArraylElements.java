package Assignment2.Arrays;

public class AverageOfArraylElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8, 9, 14};
        float sum = 0;

        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
            sum = sum + a[i];
        }
        System.out.println("Average of array elements = " + (sum/a.length));
    }
}
