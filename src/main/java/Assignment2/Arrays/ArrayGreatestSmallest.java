package Assignment2.Arrays;

public class ArrayGreatestSmallest {

    public static void main(String[] args) {
        int[] array = {1, 2, 0, -4, 18,-8, 9, 14, 67};
        int greatest = array[0];
        int smallest = array[0];

        for (int i = 0; i< array.length; i++){
            if(array[i] > greatest) {
                greatest = array[i];
            }
            if (array[i] < smallest){
                smallest = array[i];
            }
        }

        System.out.println("The greatest no. in the array: " + greatest);
        System.out.println("The smallest no. in the array: " + smallest);
    }
}
