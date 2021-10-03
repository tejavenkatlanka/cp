package com.git.t.medium.arrary;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {

  /**
   * Boyer-Moore Majority Vote
   *
   * @param nums
   * @return
   */
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> integers = new ArrayList<>();
    int count1 = 1, count2 = 0, num1 = nums[0], num2 = nums[0];
    for (int num : nums) {
      if (num == num1) {
        count1++;
      } else if (num == num2) {
        count2++;
      } else if (count1 == 0) {
        num1 = num;
        count1++;
      } else if (count2 == 0) {
        num2 = num;
        count2++;
      } else {
        count1--;
        count2--;

      }
    }

    count1 = 0;
    count2 = 0;
    for (int num : nums) {
      if (num == num1) {
        count1++;
      } else if (num == num2) {
        count2++;
      }
    }
    if (nums.length / 3 < count1) {
      integers.add(num1);
    }
    if (nums.length / 3 < count2) {
      integers.add(num2);
    }
    return integers;
  }
}
