public class PalindromeCheck {

    public static void main(String[] args) {
        int num = 353, i, j = 0;
        int temp = num;

        while (num != 0){
            i = num % 10;
            j = (j * 10) + i;
            num = num / 10;
        }

        if(temp == j){
            System.out.println(temp + " is a palindrome");
        }
        else{
            System.out.println(temp + " is not a palindrome");
        }
    }
}
