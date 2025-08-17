package pl.wiewior;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] pink, int[] blue) {
        int pinkSize = pink.length;
        int blueSize = blue.length;
        int purpleSize = pinkSize + blueSize;
        int[] purple = new int[purpleSize];

        int pinkPosition = 0;
        int bluePosition = 0;
        int purplePosition = 0;

        while (pinkPosition < pinkSize && bluePosition < blueSize) {
            if (pink[pinkPosition] < blue[bluePosition]) {
                purple[purplePosition++] = pink[pinkPosition++];
            } else {
                purple[purplePosition++] = blue[bluePosition++];
            }
        }
        while (pinkPosition < pinkSize) {
            purple[purplePosition++] = pink[pinkPosition++];
        }
        while (bluePosition < blueSize) {
            purple[purplePosition++] = blue[bluePosition++];
        }
        return purple;
    }

    public static int[] mergeSort(int[] array) {
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        if (left.length > 1) {
            left = mergeSort(left);
        }
        if (right.length > 1) {
            right = mergeSort(right);
        }
        return merge(left, right);

    }
}
