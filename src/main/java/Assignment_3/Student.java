package Assignment_3;

public class Student {

    int SID, Sub1, Sub2, Sub3;
    String Sname;

    public void getStuData(int SID, String Sname){
        this.SID = SID;
        this.Sname = Sname;
    }

    public void getStuMarks(int Sub1, int Sub2, int Sub3){
        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
    }

    public void totalMarks(){
        int sum = Sub1 + Sub2 + Sub3;
        System.out.println("Student Details");
        System.out.println("Student ID: " + SID + "\nStudent Name: " + Sname + "\ntotal marks: " + sum);
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();

        //to set Student data
        stu1.getStuData(1,"AAA");
        stu2.getStuData(2, "BBB");

        //to set student marks
        stu1.getStuMarks(100, 98, 99);
        stu2.getStuMarks(78, 87, 69);

        //to calculate total marks
        stu1.totalMarks();
        stu2.totalMarks();

    }
}
