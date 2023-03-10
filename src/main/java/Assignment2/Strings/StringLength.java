package Assignment2.Strings;

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a String value: ");
        String s1 = obj.nextLine();
        System.out.println("The length of the given string is: " + s1.length());
    }
}
