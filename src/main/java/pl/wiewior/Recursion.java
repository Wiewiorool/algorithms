package pl.wiewior;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
        int[] tab = RandomTab.generateRandomTab(100);

        int[] arr = {5, 4, 3, 2, 1};

        //hw 3
        System.out.println(binarySearch(tab, 200));

        //hw 4
        System.out.println("silnia iteracyjnie " + factorial(10));

        System.out.println("silnia rekurencyjnie " + recFactorial(10, 1));

        System.out.println("Bin " + toBinaryRec(7, ""));

        QuickSort.recQuickSort(arr, 0, arr.length - 1);

        System.out.println("Quicksort recursion with pivot on middle: " + Arrays.toString(arr));

        arr = MergeSort.recMergeSort(arr);
        System.out.println("MergeSort rec: " + Arrays.toString(arr));


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

    public static String toBinaryRec(int n, String result) {
        if (n == 1) return "1";
        if (n == 0) return "0";

        return toBinaryRec(n / 2, result) + (n % 2);

    }

    public static int factorial(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {
            num = num * i;

        }
        return num;

    }

    //recFactorial(6,1)
    public static int recFactorial(int n, int i) {
        if (n == i) {
            return n;
        } else {
            return i * recFactorial(n, ++i);
        }
    }
}
