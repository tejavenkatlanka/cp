package com.git.t.medium.arrary;

public class HouseRobber {

  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
  }

  /**
   * 1,2,3,4,5,6,7,8,9 0,0 1,0 2,1 4,2 ....
   *
   * @param nums
   * @param lo
   * @param hi
   * @return
   */
  private int rob(int[] nums, int lo, int hi) {
    int in = 0, ex = 0;
    for (int i = lo; i < hi; i++) {
      int li = in, le = ex;
      in = le + nums[i];
      ex = Math.max(li, le);
    }
    return Math.max(in, ex);
  }
}
