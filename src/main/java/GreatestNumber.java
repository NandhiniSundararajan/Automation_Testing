public class GreatestNumber {

    public static void main(String[] args) {
        int x = 1454905;
        int y = 19080;
        int z = 2067;

        //to check if x is the greatest no.
        if (x>y) {
            if (x > z) {
                System.out.println("The greatest number is " + x);
            }
        //to check if y is the greatest
        } else if (y>z) {
                System.out.println("The greatest number is " + y);
            }
            // At this point, z is determined as the greatest number, hence print z
            else{
                System.out.println("The greatest number is " + z);
            }
    }
}
