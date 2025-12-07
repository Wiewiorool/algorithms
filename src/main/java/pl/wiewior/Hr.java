package pl.wiewior;

import java.util.Arrays;

public class Hr {

    public static int robMemo(int[] nums) {
        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return hrMemo(nums, nums.length, memo);
    }

    public static int robReccursion(int[] nums) {
        return hr(nums, nums.length - 1);
    }

    public static int hr(int[] houses, int i) {
        if (i < 0) {
            return 0;
        }
        int take = houses[i] + hr(houses, i - 2);
        int notTake = 0 + hr(houses, i - 1);
        return Math.max(take, notTake);
    }

    public static int hrMemo(int[] houses, int i, int[] memo) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return houses[0];
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int take = houses[i - 1] + hrMemo(houses, i - 2, memo);
        int notTake = hrMemo(houses, i - 1, memo);

        memo[i] = Math.max(take, notTake);
        return memo[i];
    }
}

