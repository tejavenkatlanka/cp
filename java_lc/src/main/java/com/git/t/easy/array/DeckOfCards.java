package com.git.t.easy.array;

import java.util.HashMap;
import java.util.Map;

;

public class DeckOfCards {

  public boolean hasGroupsSizeX(int[] deck) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : deck
    ) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int res = 0;
    for (int count : map.values()) {
      res = gcd(count, res);
    }
    return res > 1;
  }

  private int gcd(int a, int b) {
    return b > 0 ? gcd(b, a%b) : a;
  }
}
