package Assignment2.Strings;

import java.util.Scanner;

public class NoOfWordsInSentence {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String s = obj.nextLine();
        //System.out.println(s);
        int count = 0;

        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("The no. of words in the sentence: " + (count+1));
    }
}
