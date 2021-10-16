package com.git.t.medium.number;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

  public int longestConsecutive(int[] nums) {

    Set<Integer> hashSet = new HashSet<>();
    for (int num : nums
    ) {
      hashSet.add(num);
    }

    int max = 0;
    for (int num : nums) {
      if (!hashSet.contains(num - 1)) {
        int count = num;
        while (hashSet.contains(count)) {
          count++;
        }
        max = Math.max(count - num, max);
      }

    }
    return max;

  }
}
