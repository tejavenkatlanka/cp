package com.git.t.medium.number;

import java.util.Arrays;

public class PerfectSquares {

  public static void main(String[] args) {
    System.out.println(Math.sqrt(13));
  }

  private boolean isSquare(int n) {
    int sqr = (int) (Math.sqrt(n));
    return (sqr * sqr == n);
  }

  public int numSquares(int n) {
    if (isSquare(n)) {
      return 1;
    }

    while ((n & 3) == 0) {
      n >>= 2;
    }
    if ((n & 7) == 7) {
      return 4;
    }

    // Check whether 2 is the result.
    int sqrt_n = (int) (Math.sqrt(n));
    for (int i = 1; i <= sqrt_n; i++) {
      if (isSquare(n - i * i)) {
        return 2;
      }
    }

    return 3;
  }

  public int numSquares1(int n) {
    int[] dp = new int[n + 1];

    Arrays.fill(dp, Integer.MAX_VALUE);

    dp[0] = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j * j <= i; j++) {

        dp[i] = Math.min(dp[i], dp[i - j * j] + 1);

      }

    }

    return dp[n];
  }

}
