package com.git.t.easy;

public class ArrayMoves {

    public int minMoves(int[] nums) {
        int min = nums[0], res = 0;
        for (int el : nums) {
            min = Math.min(min, el);
        }
        for (int el : nums) {
            res += el - min;
        }
        return res;
    }
}
