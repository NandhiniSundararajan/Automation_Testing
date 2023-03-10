package Assignment2.Strings;

import java.util.Scanner;

public class CharRepetition {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String s = obj.nextLine();
        System.out.println("Please enter a character: ");
        char c = obj.next().charAt(0);
        int count = 0;

        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("Character '" + c + "' is printed " + count + " times");
    }

}
