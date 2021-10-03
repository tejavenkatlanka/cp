package com.git.t.easy.number;

public class HammingDistance {

  public int hammingDistance(int x, int y) {
    int res = 0;
    int xor = x ^ y;
    while (xor != 0) {
      res += xor & 1;
      xor >>= 1;
    }
    return res;
  }
}
