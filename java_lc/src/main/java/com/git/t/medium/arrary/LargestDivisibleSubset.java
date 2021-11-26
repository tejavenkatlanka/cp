package com.git.t.medium.arrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

  public List<Integer> largestDivisibleSubset(int[] nums) {

    int[] l = new int[nums.length];
    int[] pre = new int[nums.length];
    Arrays.sort(nums);
    int max = 0, index = -1;
    for (int i = 0; i < nums.length; i++) {
      l[i] = 1;
      pre[i] = -1;
      for (int j = i - 1; j >= 0; j--) {
        if (nums[i] % nums[j] == 0 && l[j] + 1 > l[i]) {
          l[i] = l[j] + 1;
          pre[i] = j;
        }

      }
      if (l[i] > max) {
        max = l[i];
        index = i;
      }

    }
    List<Integer> res = new ArrayList<>();
    while (index != -1) {
      res.add(nums[index]);
      index = pre[index];
    }
    return res;

  }

}
