package utilities;

import java.util.Random;

public class ArrayUtilities {
    public static int[] genArray(int size) {
        int[] result = new int[size];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(size);
        }

        return result;
    }

    public static boolean isSorted(int[] array) {
        //check for inversions!
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                //out of order
                return false;
            }
        }
        return true; //it must be sorted!
    }

    public static void insertionSort(int[] array, int low, int high)
    {
        // for each element starting with the second element (the first is already sorted)
        for (int i = low; i <= high; i++)
        {
            // loop down to the first element, swapping as needed
            for (int j = i; j >= low + 1; j--)
            {
                if (array[j] < array[j - 1])
                {
                    swap(array, j, j - 1);
                }
                else
                {
                    // stop now, since all elements to the left are in order
                    break;
                }
            }
        }
    }

    private static void swap(int[] array, int first, int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
