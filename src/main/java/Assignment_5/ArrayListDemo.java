package Assignment_5;



import java.util.ArrayList;
import java.util.Objects;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        ArrayList al2 = new ArrayList();

        al.add("AA");
        al.add("BB");
        al.add("CC");

        al2.add("test");
        al2.add("9");
        al2.add("2.3f");

        for(Object o: al){
            System.out.println(o);
        }

        System.out.println(al);
        System.out.println(al2);
        al.add(2,"DD");

        al.remove(1);

        al.add(al2);
        al.addAll(al2);




        System.out.println(al);
    }



}
