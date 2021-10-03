package com.git.t.easy;

public class ArrangeCoin {

  /*
  *
  *  n = (x + 1) * x / 2
x² + x = 2n
x² + x + 1/4 - 1/4 = 2n
(x + 1/2)² = 2n + 1 / 4
(x + 1/2)² = (8n + 1) / 4
x + 1/2 = sqrt(8n + 1) / 2
x = (sqrt(8n + 1) / 2) - (1 / 2)
x = (sqrt(8n + 1) - 1) / 2*/
  public int arrangeCoins1(int n) {
    return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
  }

  public int arrangeCoins(int n) {
    long nLong = (long) n;

    long st = 0;
    long ed = nLong;

    long mid = 0;

    while (st <= ed) {
      mid = st + (ed - st) / 2;

      if (mid * (mid + 1) <= 2 * nLong) {
        st = mid + 1;
      } else {
        ed = mid - 1;
      }
    }

    return (int) (st - 1);
  }

}
