package com.git.t.medium.arrary;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        //2,3,-2,4
//3 0 24
        int ans = nums[0];
        int max = 0, prod = 0;
        for (int i = 0; i < nums.length; i++) {
            prod = ((prod == 0) ? 1 : prod) * nums[i];
            max = ((max == 0) ? 1 : max) * nums[nums.length - i - 1];
            ans = Math.max(ans, Math.max(max, prod));
        }
        return ans;
    }
}
