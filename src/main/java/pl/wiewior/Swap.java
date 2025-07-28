package pl.wiewior;

public class Swap {
    public static void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;

    }
}
