package Assignment_4;

public class ComputerTeacher extends Teacher {

    //overriding parent class method
    void does()
    {   super.does();
        System.out.println("Subject handled: Computer Science");
    }

    void supervise(){
        System.out.println("Supervise theory exams and lab sessions");
    }
    void lab_sessions(){
        System.out.println("Conduct lab sessions");
    }


    public static void main(String[] args) {

        ComputerTeacher ct1 = new ComputerTeacher();
        ComputerTeacher ct2 = new ComputerTeacher();

        ct1.does();

        ct1.supervise();

        ct2.evaluate();

        ct2.lab_sessions();

    }
}
