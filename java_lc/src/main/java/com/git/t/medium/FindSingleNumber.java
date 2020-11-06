package com.git.t.medium;

public class FindSingleNumber {

    public int singleNumber(int[] nums) {
        int x1 = 0, x2 = 0, mask = 0;

        for (int el : nums) {
            x2 ^= x1 & el;
            x1 ^= el;
            mask = ~(x1 & x2);
            x2 &= mask;
            x1 &= mask;
        }
        return x1;
    }
}
