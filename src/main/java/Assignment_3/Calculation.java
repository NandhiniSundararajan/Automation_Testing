package Assignment_3;

public class Calculation {
    int x, y, z;
    public Calculation(){}
    public Calculation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("The values are: \nx = " + x + ", y = " + y + ", z = " + z);
    }

    public int sum(){
        return x + y + z;
    }

    public int sum(int x, int y){
        return x + y;
    }

    public int sum(int x, int y, int z){
        return x + y + z;
    }

    public double sum(double x, double y){
       return x + y;
    }

    public double sum(double x, double y, double z){
        return x + y + z;
    }
    public static void main(String[] args) {

        //initializing object using parameterized constructor
        Calculation cal = new Calculation(15, 10, 15);

        System.out.println("Sum of the given values = " + cal.sum());

        //initializing object using default constructor
        Calculation cal2 = new Calculation();

        System.out.println("Sum(int x, int y) = " + cal2.sum(5, 100));
        System.out.println("Sum(int x, int y, int z) = " + cal2.sum(20, 30, 40));
        System.out.println("Sum(double x, double y) = " + cal2.sum(30.25, 45.75));
        System.out.println("Sum(double x, double y, double z) = " + cal2.sum(24.50, 65.70, 45.50));

    }
}
