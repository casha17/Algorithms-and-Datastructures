package SortingAlgorithms;

public class MergeSort {



    public void mergesort(int[] array , int start , int sizeOfArray ) {
        // p == start and r == size
        if (start < sizeOfArray ) {
            int q  = ( (start + sizeOfArray) / 2);

           mergesort(array , start , q);
           mergesort(array , q+1 , array.length);

          merge(array , start , q , array.length);
        }




    }


    public void merge(int[] array , int start , int mid , int sizeOfArray) {

        int n1 = mid - start+1 ;
        int n2 = sizeOfArray - mid;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for (int i = 0; i < n1; i++) {
            L[i] = array[start+i ];
        }

        for (int j=0; j< n2; j++) {
            R[j] = array[mid +j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        for (int k =start; k< sizeOfArray; k++ ) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i = i +1;
            } else if (array[k] == R[j]) {

                j = j+1;
            }
        }


    }
}
