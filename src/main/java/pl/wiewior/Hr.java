package pl.wiewior;

import java.util.Arrays;

public class Hr {

    public static int robMemo(int[] nums) {
        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return hrMemo(nums, nums.length, memo);
    }

    public static int robRecursion(int[] nums) {
        return hr(nums, nums.length - 1);
    }

    public static int hr(int[] houses, int i) {
        if (i < 0) {
            return 0;
        }
        if (i == 1) {
            return houses[0];
        }
        int take = houses[i] + hr(houses, i - 2);
        int notTake = hr(houses, i - 1);
        return Math.max(take, notTake);
    }

    public static int hrMemo(int[] houses, int i, int[] memo) {
        if (i < 0) {
            return 0;
        }
        if (i == 1) {
            return houses[0];
        }
       /* if (memo[i] != -1) {
            return memo[i];
        }*/

        int neighbour2;
        if (memo[i - 2] == -1) {
            neighbour2 = hrMemo(houses, i - 2, memo);
        } else {
            neighbour2 = memo[i - 2];
        }
        int neighbour1;
        if (memo[i - 1] == -1) {
            neighbour1 = hrMemo(houses, i - 1, memo);
        } else {
            neighbour1 = memo[i - 1];
        }
        int take = houses[i - 1] + neighbour2;
        int notTake = neighbour1;

        memo[i] = Math.max(take, notTake);
        return memo[i];
    }

    public static int dpMemo(int[] houses) {
        int[] memo = new int[houses.length];
        memo[0] = houses[0];
        memo[1] = Math.max(houses[0],houses[1]);

        for (int i = 2; i < memo.length; i++) {
            int take = houses[i] + memo[i - 2];
            int notTake = memo[i - 1];
            memo[i] = Math.max(take, notTake);
        }
        return memo[memo.length - 1];
    }
}
