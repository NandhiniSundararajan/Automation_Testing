package Assignment_1;

import java.util.Scanner;
public class UserLogin {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter username:");
            String uname = sc.nextLine();
            System.out.println("Please enter password:");
            String password = sc.nextLine();
            int count = 1;

            while(!(uname.equals("username") && password.equals("password"))){
                System.out.println("incorrect credentials! pls enter again:");
                System.out.println("Please enter username:");
                uname = sc.nextLine();
                System.out.println("Please enter password:");
                password = sc.nextLine();
                count++;
            }
            System.out.println("You are logged in attempt number " + count );
    }
}
