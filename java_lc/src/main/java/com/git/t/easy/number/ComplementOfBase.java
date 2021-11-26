package com.git.t.easy.number;

public class ComplementOfBase {

  public int bitwiseComplement(int n) {
    int x = 1;
    while (n > x) {
      x = x * 2 + 1;
    }
    return n ^ x;

  }

}
