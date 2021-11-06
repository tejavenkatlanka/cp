package com.git.t.easy.array.matrix;

public class MonotonicArray {

  public boolean isMonotonic(int[] nums) {
  return isIncreases(nums) ||isDecreased(nums);
  }

  private boolean isIncreases(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > nums[i]) {
        return false;
      }
    }
    return true;
  }
  private boolean isDecreased(int[] nums){
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] < nums[i]) {
        return false;
      }
    }
    return true;
  }
}
