package com.git.t.easy.array.min;

public class MinCostClimbingStairs {

  public int minCostClimbingStairs(int[] cost) {
    int first = cost[0], second = cost[1];
    for (int i = 2; i < cost.length; i++) {
      int min = cost[i] + Math.min(first, second);
      first = second;
      second = min;
    }
    return Math.min(first, second);
  }
}
