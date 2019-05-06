package SortingAlgorithms;


public class CountingSort {


    public int[] countingsort(int[] in_array ,int k) {

        int[] B = new int[in_array.length];
        int[] C = new int[k];

        for (int i = 0; i <k; i++) {
          C[i] = 0;
        }

        for (int j = 0; j < in_array.length+1; j++) {
            C[in_array[j]] = C[in_array[j]]+1;
        }

        for (int i = 0; i < k; i++) {
            C[i] = C[i] + C[i-1];
        }

        for (int j = in_array.length; j > 1; j--) {
            B[C[in_array[j]]] = in_array[j];
            C[in_array[j]] = C[in_array[j]]-1;
        }

        return B;

    }
}
