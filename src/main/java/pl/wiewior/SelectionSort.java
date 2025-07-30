package pl.wiewior;


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
            Swap.swap(tab, i, minIndex);

        }
        return tab;
    }
}
