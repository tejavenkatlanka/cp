package com.git.t.medium.arrary;

public class SingleNumber {

  public int[] singleNumber(int[] nums) {
    int diff = 0;
    for (int num : nums) {
      diff ^= num;
    }
    diff &= -diff;
    int[] ret = {0, 0};
    for (int num : nums) {
      if ((num & diff) == 0) {
        ret[0] ^= num;
      } else {
        ret[1] ^= num;
      }
    }
    return ret;
  }
}
