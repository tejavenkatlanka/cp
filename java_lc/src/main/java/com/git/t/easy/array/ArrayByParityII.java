package com.git.t.easy.array;

public class ArrayByParityII {

  public int[] sortArrayByParityII(int[] nums) {

    int even = 0;
    int odd = 1;
    while (true) {

      while (even < nums.length && nums[even] % 2 == 0) {
        even += 2;
      }
      while (odd < nums.length && nums[odd] % 2 != 0) {
        odd += 2;
      }

      if (Math.max(even, odd) < nums.length) {
        nums[even] ^= nums[odd];
        nums[odd] ^= nums[even];
        nums[even] ^= nums[odd];
      } else {
        break;
      }
    }
    return nums;
  }


}
