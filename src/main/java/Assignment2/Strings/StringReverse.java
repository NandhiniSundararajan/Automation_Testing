package Assignment2.Strings;

public class StringReverse {

    public static void main(String[] args) {
        String s = "Java Selenium Test";
        String s2 = "";
        String s_temp;
        int m = s.length();
        System.out.println("The length of the string is " + m);

           while(m!=0){
            s_temp = s.substring((m-1),m);
            m--;
            s2 = s2.concat(s_temp);
        }
        System.out.println(s2);
    }
}
