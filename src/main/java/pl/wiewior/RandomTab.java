package pl.wiewior;

import java.util.Random;

public class RandomTab {

    public static int[] generateRandomTab(int size) {
        int[] tab = new int[size];
        var random = new Random();
        for (int i = 0; i < size; i++) {
            tab[i] = random.nextInt();
        }
        return tab;
    }
}
