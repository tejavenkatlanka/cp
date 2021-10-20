package com.git.t.easy.string;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {

  public List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> res = new ArrayList<>();
    int i = 0;
    while (i < s.length()) {

      int j = i;
      while (j < s.length() && s.charAt(i) == s.charAt(j)) {
        j++;
      }
      if (j - i > 2) {
        res.add(List.of(i, j - 1));
      }
      i=j;

    }

    return res;


  }
}
