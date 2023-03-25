package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionUsingThrows
{
   static void readFile() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ghuru\\Desktop\\Test - FileNotFound");
        BufferedReader bfr = new BufferedReader(fr);
        System.out.println(bfr.readLine());
    }
    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException ie){
            System.out.println(ie);
        }
        finally {
            System.out.println("Check for Finally block");
        }
    }

}
