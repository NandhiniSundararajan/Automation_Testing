package Assignment_5;

public class UserDefinedExceptionDemo {

    public static void main(String[] args) {

        UserDefinedException obj = new UserDefinedException("ABC","pass1234");

        obj.login("ABC","pa1234");
    }
}
