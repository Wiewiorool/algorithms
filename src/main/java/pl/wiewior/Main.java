package pl.wiewior;

import static pl.wiewior.BubbleSort.bubbleSort;
import static pl.wiewior.SelectionSort.sort;

public class Main {
    public static void main(String[] args) {
        int[] tab = {4, 2, 3, 55, 62, 13, 45, 999};
        int[] sorted = sort(tab);

        for (int num : sorted) {
            //System.out.print(num + ", ");
        }
       //
        int[] tab1 = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] tab2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] tab3 = {5, 0, 0, 0, 1, -1};
        int[] tab4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};
        int[] sortedTab1 = bubbleSort(tab1);
        int[] sortedTab2 = bubbleSort(tab2);
        int[] sortedTab3 = bubbleSort(tab3);
        int[] sortedTab4 = bubbleSort(tab4);
        //System.out.println("Bubble: ");
        for (int num : sortedTab4) {
            //System.out.print(+num + ", ");


        }
        //generating random array
        int[] randTab = RandomTab.generateRandomTab(10_000);

        long start = System.nanoTime();

        bubbleSort(randTab);

        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Czas sortowania tabeli: " + duration);
    }
}