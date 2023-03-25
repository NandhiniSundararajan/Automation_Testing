package Assignment_5;

public class DivideByZero {

    public static void main(String[] args) {
        int a = 5;

        try {
            System.out.println(a / 0);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide an integer by zero");
        }
        finally {
            System.out.println("Output from finally block: " + (a+10));
        }


    }
}
