package pl.wiewior;

public class Main {
    public static void main(String[] args) {
        int[] tab = {4, 2, 3, 55, 62, 13, 45, 999};
        int[] sorted = SelectionSort.sort(tab);

        for (int num : sorted) {
            System.out.println(num + " ");
        }
    }
}