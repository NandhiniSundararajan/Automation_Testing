package Assignment_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //to get the year input from user
        System.out.println("Please enter a year: ");

        //to assign the user input to a variable 'year' and check for leap year
        if(obj.hasNextInt()){
                int year = obj.nextInt();
                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year");
                }
                else {
                    System.out.println(year + " is not a leap year");
                }
        }
        else{
            System.out.println("Invalid year");
        }
    }
}
