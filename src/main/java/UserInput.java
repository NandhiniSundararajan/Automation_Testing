import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Scanner so = new Scanner(System.in);
        System.out.println("Please enter a number:");
        double i = obj.nextDouble();

        if (i<0) {
            System.out.println("The input is negative");
        }
        else {
            System.out.println("The input is positive");
        }
        /*System.out.println("Please enter text:");
        String j = so.next();
        System.out.println(j);*/
    }
}
