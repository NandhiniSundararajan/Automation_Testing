package Assignment_4;

public class Calculation implements A, C {

    @Override
    public void sum() {
        int c = a + b;
        System.out.println("a + b = " + c);
    }

    @Override
    public void mul() {
        int z = x * y;
        System.out.println("x * y = " + z);
    }

    public static void main(String[] args) {

        Calculation cal = new Calculation();
        cal.sum();
        cal.mul();
    }
}
