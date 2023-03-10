package Assignment2.Arrays;

public class ArrayDuplicate {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 14, 14};
        int[] tempArray = new int [10];
        int temp = array[0];
        int count = 0;

        System.out.println("Duplicate elements present in array are:");
        for(int i = 0; i < (array.length-1); i++){
            if(array[i] == array[i+1]){
                //count++;
                System.out.println(array[i]);
            }
        }
    }
}
