package com.git.t.medium.arrary;

public class SingleElementSortedArray {

  public int singleNonDuplicate(int[] nums) {

    int left = 0;
    int right = nums.length-1;

    while (left < right) {
      int mid = (left + right) >> 1;

      if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid - 1] == nums[mid
         ] )) {
        left = mid + 1;
      } else {
        right = mid ;
      }

    }
    return nums[left];


  }

  public int singleNonDuplicate1(int[] nums) {

    int left = 0;
    int right = nums.length;

    while (left < right) {
      int mid = (left + right) >> 1;

      if ((mid == 0 || nums[mid - 1] != nums[mid]) && (mid == nums.length - 1 || nums[mid] != nums[
          mid + 1])) {

        return nums[mid];
      }
      int higher = mid == nums.length - 1 ? mid : nums[mid] == nums[mid + 1] ? mid + 1 : mid;

      if (higher % 2 == 1) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }

    }
    return nums[left];


  }
}
