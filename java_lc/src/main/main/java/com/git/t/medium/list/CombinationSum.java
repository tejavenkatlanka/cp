package com.git.t.medium.list;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> ret = new ArrayList<>();
    if (k == 0 || n <= 0 || n > 45) {
      return ret;
    }

    combineHelper(ret, new ArrayList<>(), k, n, 1);
    return ret;
  }

  private void combineHelper(List<List<Integer>> ret, List<Integer> integers, int k, int n,
      int start) {

    if (integers.size() == k && n == 0) {
      ret.add(new ArrayList<>(integers));
      return;
    }
    if (integers.size() > k || n < 0) {
      return;
    }
    for (int i = start; i < 10; i++) {
      if (!integers.contains(i)) {
        integers.add(i);
        combineHelper(ret, integers, k, n - i, i);
        integers.remove(integers.size() - 1);
      }
    }
  }
}
