package Assignment_1;

public class Factorial {

    public static void main(String[] args) {
        int num = 6, j= 1;
        for (int i = 1; i <= num; i++){
            j = j*i;
            }
        System.out.println( num + "! = " + j);
    }
}
