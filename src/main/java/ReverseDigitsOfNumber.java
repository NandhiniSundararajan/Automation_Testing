public class ReverseDigitsOfNumber {

    public static void main(String[] args) {
        int num = 1214;
        System.out.print("The reverse of " + num + " is ");

        while (num != 0) {
            int j = num % 10;
            System.out.print(j);
            num = num / 10;
            //System.out.println(num);
            }
    }
}
