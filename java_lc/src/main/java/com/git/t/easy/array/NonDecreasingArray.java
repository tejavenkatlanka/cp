package com.git.t.easy.array;

public class NonDecreasingArray {

  public boolean checkPossibility(int[] nums) {
    int nonDecreasingCount = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] >= nums[i - 1]) {
        continue;
      }
      nonDecreasingCount++;
      if (nonDecreasingCount > 1) {
        return false;
      }
      if (i == nums.length - 1 || i - 2 < 0) {
        continue;
      }
      if (nums[i + 1] < nums[i - 1] && nums[i] < nums[i - 2]) {
        return false;
      }
      continue;
    }
    return true;

  }
}
