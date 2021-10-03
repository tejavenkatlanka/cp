package com.git.t.medium.string;

import java.util.Arrays;
import java.util.Objects;

public class LargestNumber {

  public String largestNumber(int[] nums) {
    String[] strings = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      strings[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(strings, (o1, o2) -> {
      String s1 = o1 + o2;
      String s2 = o2 + o1;
      return s2.compareTo(s1);
    });
    if (Objects.equals(strings[0], "0")) {
      return "0";
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < strings.length; i++) {
      builder.append(strings[i]);
    }
    return builder.toString();
  }
}
