package Util;

public class Printer {


    /**
     * Static method to print a array
     * @param array The array to be printed
     */
    public static void PrintArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}
