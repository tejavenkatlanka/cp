package com.git.t.easy.number;

public class PerfectNumber {

  public boolean checkPerfectNumber(int num) {
    if (num == 1) {
      return false;
    }
    int total = 0;
    int i = 2;
    int sq = (int) Math.sqrt(num);
    while (i <= sq) {
      if (num % i == 0) {
        total += i;
        if (num / i != i) {
          total += num / i;

        }
      }
      i++;
    }
    total++;
    return total == num;
  }
}
