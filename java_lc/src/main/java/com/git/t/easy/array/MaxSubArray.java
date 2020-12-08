package com.git.t.easy.array;

public class MaxSubArray {

  public double findMaxAverage(int[] nums, int k) {
    double max = Integer.MIN_VALUE;
    double curr = 0;
    int left = 0;
    for (int i = 0, count = 1; i < nums.length; i++, count++) {
      curr += nums[i];
      if (count == k) {
        max = Math.max(max, curr / k);
        count--;
        curr -= nums[left++];
      }
    }
    return max;
  }

  public double findMaxAverageV1(int[] nums, int k) {
    double sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];

    }
    double max = sum;
    double curr = 0;
    for (int i = k, left = 0; i < nums.length; i++, left++) {
      sum += nums[i] - nums[left];
      max = Math.max(max, sum);
    }
    return max / k;
  }
}
