package com.git.t.easy.array;

import java.util.Arrays;

public class SumOfArrayAfterKNegations {

  public int largestSumAfterKNegations(int[] nums, int k) {
    Arrays.sort(nums);
    for (int i = 0; k > 0 && i < nums.length && nums[i] < 0; i++, k--) {
      nums[i] = -nums[i];
    }

    int sum = 0, min = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      min = Math.min(nums[i], min);
    }

    return sum - k % 2 * min * 2;
  }
}
