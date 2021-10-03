package com.git.t.medium.arrary;

public class UglyNumber {

  public int nthUglyNumber(int n) {
    int[] num = new int[n];
    int factor2 = 2, factor3 = 3, factor5 = 5;
    int index1 = 0, index2 = 0, index3 = 0;
    num[0] = 1;
    for (int i = 1; i < n; i++) {
      int min = Math.min(factor2, Math.min(factor3, factor5));
      num[i] = min;
      if (factor2 == min) {
        factor2 = 2 * num[++index1];
      }
      if (factor3 == min) {
        factor3 = 3 * num[++index2];
      }
      if (factor5 == min) {
        factor5 = 5 * num[++index3];
      }
    }
    return num[n - 1];

  }
}
