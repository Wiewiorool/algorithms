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

    public static int[] recMergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = recMergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = recMergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeTwo(left, right);
    }

    private static int[] mergeTwo(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < first.length && j < second.length)) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }
}
