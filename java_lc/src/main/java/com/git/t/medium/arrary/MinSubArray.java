package com.git.t.medium.arrary;

public class MinSubArray {
  public int minSubArrayLen(int s, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int ans = Integer.MAX_VALUE,left=0;
    int sum=0;
    for (int i=0;i< nums.length;i++)
    {
      sum+=nums[i];
      while (sum>=s){
        ans=Math.min(ans,i-left+1);
        sum-=nums[left++];
      }

    }
    return ans == Integer.MAX_VALUE ? 0 : ans;

  }
  public int minSubArrayLen1(int s, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int ans = Integer.MAX_VALUE;
    int sum[] = new int[nums.length];
    sum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum[i] = sum[i - 1] + nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        int su = sum[j] - sum[i] + nums[i];
        if (su >= s) {
          ans = Math.min(ans, j - i + 1);
          break;
        }

      }
    }
    return ans == Integer.MAX_VALUE ? 0 : ans;
  }
}
