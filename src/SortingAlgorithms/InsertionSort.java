package SortingAlgorithms;


import Util.ArrayGenerator;

public class InsertionSort {


    /**
     *
     * @param array an unsorted array
     * @return The array sorted
     *
     *
     *
     */
    public int[] InsertionSort(int[] array) {
            for (int j = 1; j < array.length; j++) {
                int key = array[j];
                int i = j - 1;
                while (i >= 0 && array[i] > key) {
                    array[i + 1] = array[i];
                    i = i - 1;
                }
                array[i + 1] = key;
            }
            return array;
    }


    /**
     * Starts the Insertionsort
     * @param n
     */
    public void start(int n) {


        var array = ArrayGenerator.randomPermutation(n);

        System.out.println("Not sorted");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);

        }


        InsertionSort insertionSorts = new InsertionSort();

        var sortedArray = insertionSorts.InsertionSort(array);
        System.out.println();
        System.out.println("Sorted");
        for (int i = 0; i < sortedArray.length; i++) {

            System.out.print(sortedArray[i] + ",");
        }
    }


}
