package pl.wiewior;

import java.util.Arrays;

import static pl.wiewior.MergeSort.merge;
import static pl.wiewior.SelectionSort.sort;

public class Main {
    public static void main(String[] args) {
        int[] tab = {14, 9, 6, 3, 2, 7, 0};
        int[] sorted = sort(tab);

   /*     for (int num : sorted) {
            //System.out.print(num + ", ");
        }

        int[] tab1 = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] tab2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] tab3 = {5, 0, 0, 0, 1, -1};
        int[] tab4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};
        int[] sortedTab1 = bubbleSort(tab1);
        int[] sortedTab2 = bubbleSort(tab2);
        int[] sortedTab3 = bubbleSort(tab3);
        int[] sortedTab4 = bubbleSort(tab4);
        System.out.println("Bubble: ");
        for (int num : sortedTab4) {
            //System.out.print(+num + ", ");*/


   /*     //generating random array
        }
        int[] randTab = RandomTab.generateRandomTab(100);

        long start = System.nanoTime();

        bubbleSort(randTab);

        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Czas sortowania tabeli: " + duration);
        *//*
        InsertSort.insertionSort(tab);
        System.out.println();
        for (int num : tab) {
            System.out.print(+num + ", ");
        }*/

        //Zadanie 2
        int[] pink = new int[]{1, 3, 5};
        int[] blue = new int[]{0, 2, 6};
        System.out.println(Arrays.toString(merge(pink, blue)));

        int[] red = new int[]{1, 2, 3, 8, 9, 10, 11, 12};
        int[] white = new int[]{2, 5, 6};

        System.out.println(Arrays.toString(merge(red, white)));

        int[] one = new int[]{1};
        int[] two = new int[]{2, 5, 6};
        System.out.println(Arrays.toString(merge(one, two)));


    }

}