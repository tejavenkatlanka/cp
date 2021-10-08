package com.git.t.easy.array.min;

public class LargestNumberAtLeastTwice {

  public int dominantIndex(int[] nums) {
    int index = -1, max = 0, secondMax = -1;

    for (int i = 0; i < nums.length; i++) {
      int cu = nums[i];
      if (cu > secondMax) {
        if (cu > max) {
          secondMax = max;
          max = cu;
          index = i;
        } else {
          secondMax = cu;
        }
      }
    }
    return secondMax * 2 <= max ? index : -1;
  }
}
