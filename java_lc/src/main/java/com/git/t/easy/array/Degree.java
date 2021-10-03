package com.git.t.easy.array;

import java.util.HashMap;
import java.util.Map;

public class Degree {


  public static int findShortestSubArray(int[] nums) {
    if (nums.length < 2) {
      return nums.length;
    }

    int maxNumber = 0;
    for (int num : nums) {
      maxNumber = Math.max(maxNumber, num);
    }

    int[] count = new int[maxNumber + 1];
    int[] start = new int[maxNumber + 1];
    int[] end = new int[maxNumber + 1];

    int maxCount = 0;
    for (int i = 0; i < nums.length; i++) {
      count[nums[i]] = count[nums[i]] + 1;
      if (start[nums[i]] == 0) {
        start[nums[i]] = i + 1;
      }
      end[nums[i]] = i + 1;
      maxCount = Math.max(maxCount, count[nums[i]]);
    }

    int minLength = Integer.MAX_VALUE;
    for (int i = 0; i < count.length; i++) {
      if (count[i] == maxCount) {
        int degree = end[i] - start[i] + 1;
        minLength = Math.min(minLength, degree);
      }
    }
    return minLength;
  }

  public int findShortestSubArray1(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>(), firstIndex = new HashMap<>();
    int res = 0, deg = 0;
    for (int i = 0; i < nums.length; i++) {
      firstIndex.putIfAbsent(nums[i], i);
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      if (map.get(nums[i]) > deg) {
        deg = map.get(nums[i]);
        res = i - firstIndex.get(nums[i]) + 1;

      } else if (map.get(nums[i]) == deg) {
        res = Math.min(res, i - firstIndex.get(nums[i]) + 1);

      }
    }
    return res;
  }
}
