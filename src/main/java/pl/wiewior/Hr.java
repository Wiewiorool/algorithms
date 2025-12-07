package pl.wiewior;

public class Hr {

    public int hr(int[] houses, int i) {
        if (i < 0) {
            return 0;
        }
        int take = houses[i] + hr(houses, i - 2);
        int notTake = 0 + hr(houses, i - 1);
        return Math.max(take, notTake);
    }
}

