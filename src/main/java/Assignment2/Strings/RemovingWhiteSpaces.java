package Assignment2.Strings;

public class RemovingWhiteSpaces {

    public static void main(String[] args) {
        String s = "  Hello    World  !!!  ";
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        s = s.replaceAll("\\s", "");
        System.out.println(s);

    }
}
