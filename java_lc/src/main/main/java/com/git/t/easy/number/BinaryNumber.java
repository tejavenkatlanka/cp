package com.git.t.easy.number;

public class BinaryNumber {

  public boolean hasAlternatingBits(int n) {
    n = n ^ (n >> 1);
    return (n & n + 1) == 0;
  }
}
