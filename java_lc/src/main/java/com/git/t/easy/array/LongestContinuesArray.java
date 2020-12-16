package com.git.t.easy.array;

public class LongestContinuesArray {


  /**
   * sliding window
   *
   * @param nums
   * @return
   */
  public int findLengthOfLCISSlide(int[] nums) {
    int ans = 0, anchor = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (i > 0 && nums[i - 1] >= nums[i]) {
        anchor = i;
      }
      ans = Math.max(ans, i - anchor + 1);
    }
    return ans;
  }

  /**
   * greedy
   *
   * @param nums
   * @return
   */
  public int findLengthOfLCIS(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int ret = 1, len = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1]) {
        len++;
      } else {
        len = 1;
      }
      ret = Math.max(ret, len);
    }
    return ret;
  }
}
