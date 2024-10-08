package test;

import sorting.Sorter;
import utilities.ArrayUtilities;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        //run the test 5 times
        for (int i = 1; i <= 5; i++) {
            int[] array = ArrayUtilities.genArray(20000000);

            //before
            System.out.println(Arrays.toString(array));
            sorter.bubbleSort(array);
            //after
            System.out.println(Arrays.toString(array));
            System.out.println("Is sorted? " +
                ArrayUtilities.isSorted(array));
            System.out.println();
        }
    }
}
