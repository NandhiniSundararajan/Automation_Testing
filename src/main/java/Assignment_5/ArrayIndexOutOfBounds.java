package Assignment_5;

public class ArrayIndexOutOfBounds {

    public static void main(String[] args) {

        int[] b = {1, 2, 3, 4};

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Finally block is always executed");
        }
    }
}