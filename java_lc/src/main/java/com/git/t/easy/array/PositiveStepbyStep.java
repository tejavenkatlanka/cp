package com.git.t.easy.array;

public class PositiveStepbyStep {

  public int minStartValue1(int[] nums) {
    int min = 0, sum = 0;
    for (int num : nums) {
      sum += num;
      min = Math.min(sum, min);

    }
    return 1-min;
  }

  public int minStartValue(int[] nums) {
    int res = 1, sum = 1;
    for (int num : nums) {
      sum += num;
      if (sum < 1) {
        int inc = Math.abs(sum) + 1;
        sum += inc;
        res += inc;
      }

    }
    return res;
  }
}
