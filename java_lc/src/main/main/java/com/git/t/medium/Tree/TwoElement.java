package com.git.t.medium.Tree;

import java.util.TreeSet;

public class TwoElement {

  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    if (nums.length < 2 || k == 0) {
      return false;
    }
    TreeSet<Long> set = new TreeSet<>();
    int i = 0;
    while (i < nums.length) {
      long l = nums[i];
      Long floor = set.floor(l);
      Long ceiling = set.ceiling(l);
      if ((floor != null && l - floor <= t) || (ceiling != null && ceiling - l <= t)) {
        return true;
      }
      set.add((long) nums[i++]);
      if (i > k) {
        set.remove((long) nums[i - k - 1]);
      }
    }
    return false;
  }
}
