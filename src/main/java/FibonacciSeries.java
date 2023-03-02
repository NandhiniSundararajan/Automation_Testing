public class FibonacciSeries {

    public static void main(String[] args) {
        int i = 0, j = 1, sum = 0;
        System.out.println(i + j);

        while (j >= i){
            sum = i + j;
            i = j;
            j = sum;

            if (sum > 50) {
                break;
            }

            System.out.println(sum);
        }
    }
}
