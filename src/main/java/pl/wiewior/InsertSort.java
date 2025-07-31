package pl.wiewior;

public class InsertSort {

    public static int[] insertionSort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[i] < tab[j]) {
                    for (int k = i; k >= 0; k--) {
                        Swap.swap(tab, k, k - 1);
                    }
                }
            }
        }
        return tab;
    }
}
