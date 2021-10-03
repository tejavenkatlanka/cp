package com.git.t.easy.number;

import java.util.ArrayList;
import java.util.Collection;

public class SelfDividingNumbers {

  public Collection<Integer> selfDividingNumbers(int left, int right) {
    Collection<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {

      if (isSelfDividingNumber(i)) {
        list.add(i);
      }

    }
    return list;
  }

  private boolean isSelfDividingNumber(int i) {
    int num = i;
    while (num > 0) {
      int d = num % 10;
      if (d == 0 || d % 10 == 0 || i % d != 0) {
        return false;
      }

      num = num / 10;

    }

    return true;
  }
}
