package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinSubArrayTest {

  @Test
  void minSubArrayLen() {
    MinSubArray minSubArray = new MinSubArray();
    assertEquals(2, minSubArray.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
  }
}