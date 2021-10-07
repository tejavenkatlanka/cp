package com.git.t.easy.array.min;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

  @Test
  void minCostClimbingStairs() {
    MinCostClimbingStairs minCostClimbingStair=new MinCostClimbingStairs();

    assertEquals(15,minCostClimbingStair.minCostClimbingStairs(new int[]{10,15,20}));
  }
}