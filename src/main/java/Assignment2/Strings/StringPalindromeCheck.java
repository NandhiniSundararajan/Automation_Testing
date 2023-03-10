package Assignment2.Strings;

public class StringPalindromeCheck {

    public static void main(String[] args) {

        String s1 = "123 level 321";
        String s2 = "";
        String s_temp;
        int m = s1.length();
        System.out.println("The given string is " + s1);

        while(m!=0){
            s_temp = s1.substring((m-1),m);
            m--;
            s2 = s2.concat(s_temp);
        }
        System.out.println("The reversed string is " +s2);

        if(s1.equals(s2)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
}
