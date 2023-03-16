package Assignment_4;

public class B implements A{

    @Override
    public void sum() {
        int c = a + b;
        System.out.println("Sum = " + c);
    }

       public static void main(String[] args) {

        B obj = new B();
        obj.sum();

    }
}
