package CalculateCyclesInPermutation;

import Util.ArrayGenerator;
import Util.Printer;


public class CalculateCycles {

    public void start(int n) {

        System.out.println("Array  ");

        var array = ArrayGenerator.randomPermutation(n);

        Printer.PrintArray(array);

        var countCycles = cyclesInArray(array);

        System.out.println("number of cycles =  "  + countCycles );
    }

    public  int cyclesInArray(int[] array) {


        boolean[] completeArray = new boolean[array.length];
        int cycles = 0;
        for(int i = 0; i<array.length; i++) {


            if (completeArray[i]) {
                continue;
            }



            var buff = array[i];
            while (buff != i) {
                completeArray[buff] = true;
                buff = array[buff];

            }
            cycles++;
        }


        return cycles;
    }
}
