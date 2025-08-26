package pl.wiewior;

public class QuickSort {
    public static void quickSort(int[] tab, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tab, low, high);
            quickSort(tab, low, pivotIndex - 1); //lew strona
            quickSort(tab, pivotIndex + 1, high); //prawa strona
        }
    }

    private static int partition(int[] tab, int low, int high) {
        int pivot = tab[high];
        int i = low - 1;

        for (int j = 0; j < high; j++) {
            if (tab[j] < pivot) {
                i++;
                Swap.swap(tab, i, j);
            }

        }
        Swap.swap(tab, i + 1, high);
        return i + 1;
    }
    public static void recQuickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        recQuickSort(nums,low,e);
        recQuickSort(nums,s,high);

    }
}
