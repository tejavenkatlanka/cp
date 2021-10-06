package com.git.t.medium.arrary;

public class JumpGame {

  public int jump(int[] nums) {

    int jumps=0, curEnd=0,curMax=0;

    for(int i=0; i< nums.length-1; i++){
        curMax=Math.max(curMax,i+nums[i]);
        if(i==curEnd){
           jumps++;
           curEnd=curMax;
        }
    }
    return  jumps;
  }
  public int jump1(int[] nums) {
    int[] mem = new int[nums.length];
    return helper(nums, 0, mem);
  }

  private int helper(int[] nums, int position, int[] mem) {

    if (position >= nums.length - 1) {
      return 0;
    }

    if (nums[position] + position >= nums.length - 1) {
      return 1;
    }

    int jumps = Integer.MAX_VALUE;
    for (int i = 1; i <= nums[position]; i++) {
      if (mem[position + i] == 0) {
        mem[position + i] = helper(nums, position + i, mem);
      }
      jumps = Math.min(jumps, mem[position + i]);

    }
    if (jumps == Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    return jumps + 1;

  }
}
