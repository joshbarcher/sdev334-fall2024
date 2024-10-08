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
}
