public class NoOfDigits {
    public static void main(String[] args) {
        int i = 12345, digit = 0;
        while( i != 0 ){
            int j = i % 10;
            i = i / 10;
            digit++;
        }
        System.out.println("The no. of digits in the given number is " + digit);
    }
}
