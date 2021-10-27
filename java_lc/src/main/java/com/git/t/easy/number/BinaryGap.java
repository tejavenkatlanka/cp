package com.git.t.easy.number;

public class BinaryGap {

  public int binaryGap(int n) {
    int res = 0;

    for (int i = -32; n > 0; n /= 2, i++) {
      if (n % 2 == 1) {
        res = Math.max(i, res);
        i = 0;
      }
    }

    return res;

  }
}
