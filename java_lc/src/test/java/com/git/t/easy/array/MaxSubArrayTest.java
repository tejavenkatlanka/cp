package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxSubArrayTest {

  @Test
  void findMaxAverage() {
    MaxSubArray subArray = new MaxSubArray();
    assertEquals(12.75, subArray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    assertEquals(-1.00000, subArray.findMaxAverage(new int[]{-1}, 1));

  }

  @Test
  void findMaxAverageV1() {
    MaxSubArray subArray = new MaxSubArray();
    assertEquals(12.75, subArray.findMaxAverageV1(new int[]{1, 12, -5, -6, 50, 3}, 4));
    assertEquals(-1.00000, subArray.findMaxAverageV1(new int[]{-1}, 1));
  }
}