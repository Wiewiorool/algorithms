package pl.wiewior;

public class SelectionSort {

    public static int[] sort(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < tab.length; j++) {
                if (min > tab[j]) {
                    min = tab[j];
                }
            }
            swap(tab, i, min);
        }
        return tab;
    }

    private static void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;

    }
}
