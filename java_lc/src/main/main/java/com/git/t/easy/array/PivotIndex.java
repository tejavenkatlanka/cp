package com.git.t.easy.array;

public class PivotIndex {

  /*
  [1,7,3,6,5,6]
  [1,8,11,17,22,28]
  [28,27,20,17,11,6]
  [1,2,3]
  [1,3,6]
  [6,5,3]
   [2,1,-1]
   [2,3,2]
    [2,0,-1]
   */
  public int pivotIndex(int[] nums) {
    int[] leftAdd = new int[nums.length];
    int[] rightAdd = new int[nums.length];
    leftAdd[0] = nums[0];
    rightAdd[nums.length - 1] = nums[nums.length - 1];
    for (int i = 1; i < nums.length; i++) {
      leftAdd[i] = nums[i] + leftAdd[i - 1];
    }
    for (int i = nums.length - 2; i >= 0; i--) {
      rightAdd[i] = nums[i] + rightAdd[i + 1];
    }

    for (int i = 0; i < nums.length; i++) {
      if (leftAdd[i] == rightAdd[i]) {
        return i;
      }
    }
    return -1;


  }

  public int pivotIndex1(int[] nums) {
    int leftSum = 0, sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    for (int i = 0; i < nums.length; i++) {

      if (leftSum == sum - nums[i] - leftSum) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;


  }
}
