package pl.wiewior;

import java.util.Random;

public class SelectionSort {

    public static int[] sort(int[] tab) {

        for (int i = 0; i < tab.length - 1; i++) { //ostatni element nie musi być już przetwarzany
            int min = Integer.MAX_VALUE;
            int minIndex = 1;
            for (int j = i; j < tab.length; j++) {
                if (min > tab[j]) {
                    min = tab[j];
                    minIndex = j;
                }
            }
            swap(tab, i, minIndex);

        }
        return tab;
    }

    public static int[] bubbleSort(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    swap(tab, j, j + 1);

                }
            }
        }
        return tab;
    }

    private static void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;

    }
}
