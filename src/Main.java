import SortingAlgorithms.CountingSort;
import SortingAlgorithms.MergeSort;
import Util.ArrayGenerator;
import Util.Printer;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {

    public static void main(String[] args) {

        var array = ArrayGenerator.randomPermutation(10);

        System.out.println("Unsorted");
        Printer.PrintArray(array);

        System.out.println("Sorted");

        CountingSort a = new CountingSort();

        IntSummaryStatistics stat = Arrays.stream(array).summaryStatistics();

        int max = stat.getMax();

        var test = a.countingsort(array,max);


        Printer.PrintArray(array);

    }



}
