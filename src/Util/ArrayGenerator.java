package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayGenerator {

    /**
     *
     * @param n The size of the array
     * @return random permutation
     */
    public static int[] randomPermutation(int n) {

        int[] array = new int[n];

        // Numbers from 0 to n shuffled
        for (int i =0; i<n; i++)
        {
            array[i] = i;
        }

        // Shuffle array
        shuffleArray(array);

        return array;
    }


    /**
     *
     * @param n The size of the array
     * @return A sorted array from 0 to n
     */
    public static int[] SortedArralist(int n) {

        int[] arrayList = new int[n];

        for (int i=0; i<n; i++) {
            arrayList[i] = i;
        }
        return arrayList;
    }

    /**
     *
     * @param n The size of the array
     * @return The array in a decreasing order
     */
    public static int[] DecreasingArray(int n) {

        int[] array = new int[n];

        for (int i=0; i < n; i++) {
            array[i] = (n-1) - i;
        }

        return array;
    }

    /**
     *
     * This method shuffle the array
     * @param array The array to be shuffled
     */
    private static void shuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
