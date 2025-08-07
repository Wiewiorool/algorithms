package pl.wiewior;

import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
        int[] tab = {123, 3, 4, 5, 6, 7};
        homeWork();

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
}
