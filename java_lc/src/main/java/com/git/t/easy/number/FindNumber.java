package com.git.t.easy;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {


  public List<Integer> findDisappearedNumbers(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int iCanReach = Math.abs(nums[i]) - 1;
      nums[iCanReach] = -Math.abs(nums[iCanReach]);
    }
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
