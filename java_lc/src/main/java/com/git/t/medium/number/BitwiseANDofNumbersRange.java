package com.git.t.medium.number;

public class BitwiseANDofNumbersRange {

  /**
   *  101
   *  110
   *  111
   *  100
   *  100
   *  1
   *  
   * @param m
   * @param n
   * @return
   */
  public int rangeBitwiseAnd(int m, int n) {

    while (n > m) {
      n = n & n - 1;
     }
    return m & n;

  }
}
