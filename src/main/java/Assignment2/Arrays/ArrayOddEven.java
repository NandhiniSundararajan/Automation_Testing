package Assignment2.Arrays;

public class ArrayOddEven {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8, 9, 14, 15};
        int[] b = new int[10];
        int[] c = new int[10];
        int j = 0, k = 0;
        float sum = 0;

        for(int i = 0; i<a.length; i++) {
            if (a[i]%2 == 0) {
                b[j] = a[i];
                System.out.println(b[j]);
                j++;
            } else{
                c[k] = a[i];
                System.out.println(c[k]);
                k++;
            };
        }

        System.out.println("Even numbers:");
        for (j =0; j < b.length; j++)
        {
            System.out.println(b[j]);
        }

        System.out.println("Odd numbers:");
        for (k = 0; k< c.length; k++){
            System.out.println(c[k]);
        }

    }
}
