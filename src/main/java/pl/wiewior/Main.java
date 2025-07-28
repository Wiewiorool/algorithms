package pl.wiewior;

public class Main {
    public static void main(String[] args) {
        int[] tab = {4, 2, 3, 55, 62, 13, 45, 999};
        int[] sorted = SelectionSort.sort(tab);

        for (int num : sorted) {
            System.out.print(num + ", ");
        }
        System.out.println();
        int[] tab1 = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] tab2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] tab3 = {5, 0, 0, 0, 1, -1};
        int[] tab4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};
        int[] sortedTab1 = SelectionSort.bubbleSort(tab1);
        int[] sortedTab2 = SelectionSort.bubbleSort(tab2);
        int[] sortedTab3 = SelectionSort.bubbleSort(tab3);
        int[] sortedTab4 = SelectionSort.bubbleSort(tab4);
        System.out.println("Bubble: " );
        for (int num : sortedTab4) {
            System.out.print(+ num + ", ");
        }
    }

}