package pl.wiewior;

import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
        int[] tab = RandomTab.generateRandomTab(100);
        homeWork();
        QuickSort.quickSort(tab, tab[0], tab[99]);

        //hw 3
        System.out.println(binarySearch(tab, 200));

        //hw 4
        System.out.println("silnia " + factorial(5));

    }

    public static void printRecursion(int[] tab, int i) {
        if (i >= tab.length) {
            return;
        }
        System.out.println(tab[i]);
        printRecursion(tab, i + 1);
    }

    public static void printIteratiwe(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }

    public static void homeWork() {
        int sum = 0;
        int[] array = RandomTab.generateRandomTab(50);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 10; i++) {
            int result = array[i];
            sum = sum + result;
        }
        System.out.println("Suma tablicy intów o długości 10: " + sum);

    }

    public static int binarySearch(int[] tab, int searchNum) {

        int startIndex = 0;
        int endIndex = tab.length - 1;
        int middleIndex = (startIndex + endIndex) / 2;

        while (startIndex < tab.length && 0 <= endIndex && startIndex <= endIndex) {
            int middleElement = tab[middleIndex];
            if (middleElement == searchNum) {
                return middleIndex;
            }
            if (searchNum < middleElement) {
                endIndex = middleIndex - 1;
                middleIndex = (startIndex + endIndex) / 2;
            } else {
                startIndex = middleIndex + 1;
                middleIndex = (startIndex + endIndex) / 2;
            }
        }
        return -1;
    }

    public static int factorial(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {
            num = num * i;

        }
        return num;

    }
}
