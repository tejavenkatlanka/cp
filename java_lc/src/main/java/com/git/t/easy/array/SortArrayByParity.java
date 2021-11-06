package com.git.t.easy.array;

public class SortArrayByParity {

  public int[] sortArrayByParity1(int[] nums) {
    for (int i = 0, j = 0; j < nums.length; j++) {
      if (nums[j] % 2 == 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }

    }

    return nums;
  }

  public int[] sortArrayByParity(int[] nums) {

    int left = 0, right = nums.length - 1;
    while (left <= right) {

      while (left < nums.length && nums[left] % 2 == 0) {
        left++;
      }

      while (0 <= right && nums[right] % 2 != 0) {
        right--;
      }
      if (left < right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
      }
      left++;
      right--;

    }

    return nums;
  }
}
