package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RangeAdditionTest {

  @Test
  void maxCount() {
    RangeAddition rangeAddition = new RangeAddition();
    assertEquals(4, rangeAddition.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
  }
}