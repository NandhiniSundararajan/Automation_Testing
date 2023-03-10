package Assignment2.Arrays;

public class Addition2DArray {

    public static void main(String[] args) {
        int[][] a = {{2,4,6}, {5,6,8}, {7,15, 45}};
        int [][] b = {{52,6,7}, {20,40, 50}, {10, 20, 30}};
        int[][] c = new int[3][3];

        for (int i = 0; i< c.length; i++){
            for (int j = 0; j<c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(" " +c[i][j]);
            }
            System.out.println();
        }
    }
}
