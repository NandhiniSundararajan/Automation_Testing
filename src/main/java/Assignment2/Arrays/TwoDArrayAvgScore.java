package Assignment2.Arrays;

public class TwoDArrayAvgScore {

    public static void main(String[] args) {

        int[][] marks = {{90, 80, 98}, {67, 98, 70}};
        float sum = 0;
       /* System.out.println(marks[0][0]);
        System.out.println(marks[0][1]);
        System.out.println(marks[0][2]);
        System.out.println(marks[1][0]);
        System.out.println(marks[1][1]);
        System.out.println(marks[1][2]);*/

        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks[i].length; j++){
                sum = sum + marks[i][j];
            }
            float avg = sum/(marks[i].length);
            System.out.println("The average score of Student " +  (i+1) + ":  " + String.format("%.2f", avg));
            sum = 0;
        }

    }
}
