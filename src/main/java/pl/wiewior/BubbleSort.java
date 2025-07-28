package pl.wiewior;

public class BubbleSort extends Swap {
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
}
