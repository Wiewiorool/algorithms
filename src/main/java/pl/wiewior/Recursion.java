package pl.wiewior;

public class Recursion {

    public static void main(String[] args) {
        int[] tab = {123, 3, 4, 5, 6, 7};
        printRecursion(tab, 0);
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
}
