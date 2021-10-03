package com.git.t.easy.number;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

  public List<String> summaryRanges(int[] nums) {
    List<String> res = new ArrayList<>();
    for (int i = 0; i < nums.length; ) {
      StringBuilder builder = new StringBuilder();
      builder.append(nums[i]);
      int current = i;
      while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
        i++;
      }
      if (i != current) {
        builder.append("->").append(nums[i]);
      }
      i++;

      res.add(builder.toString());
    }

    return res;
  }
}
