package com.git.t.easy.array;

public class NRepeatedElement {

  public int repeatedNTimes(int[] nums) {
    for (int i = 2; i < nums.length; ++i) {
      if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
        return nums[i];
      }
    }
    return nums[nums.length - 1];
  }
}
