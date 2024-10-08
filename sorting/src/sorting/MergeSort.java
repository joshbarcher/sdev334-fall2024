package sorting;

import utilities.ArrayUtilities;

import java.util.Arrays;

public class MergeSort {
    //stored values during the merge
    private static int[] temp;

    public static void main(String[] args) {
        int[] array = ArrayUtilities.genArray(100);

        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Is sorted? " + ArrayUtilities.isSorted(array));
    }

    public static void mergeSort(int[] array) {
        //double check that we have something to sort
        if (array.length <= 1) {
            return;
        }

        //match the array lengths
        temp = new int[array.length];

        //sort the entire array using mergesort
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int low, int high) {
        //base case
        if (high - low <= 0) {
            return;
        }

        int mid = (low + high) / 2;

        //sort the left sub-array
        mergeSort(array, low, mid);

        //sort the right sub-array
        mergeSort(array, mid + 1, high);

        merge(array, low, high);
    }

    private static void merge(int[] array, int low, int high) {
        //temp variables
        int mid = (low + high) / 2;
        int left = low;
        int right = mid + 1;
        int range = high - low + 1;

        for (int i = 0; i < range; i++) {
            //exhausted elements in left sub-array
            if (left > mid) {
                temp[low + i] = array[right++];
            }
            //exhausted elements in right sub-array
            else if (right > high) {
                temp[low + i] = array[left++];
            }
            else if (array[left] < array[right]) {
                temp[low + i] = array[left++];
            }
            else {
                temp[low + i] = array[right++];
            }
        }

        //copy back to the original array
        for (int i = 0; i < range; i++) {
            array[low + i] = temp[low + i];
        }
    }
}
