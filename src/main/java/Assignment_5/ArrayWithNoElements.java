package Assignment_5;

public class ArrayWithNoElements {

    public static void main(String[] args) {

        int[] a = null;

        try {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
        catch(NullPointerException ne){
            System.out.println(ne);
        }
        finally{
            System.out.println("Finally block check");

        }
    }
}
