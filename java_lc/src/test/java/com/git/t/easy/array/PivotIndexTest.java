package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PivotIndexTest {

  @Test
  void pivotIndex() {
    PivotIndex pivotIndex = new PivotIndex();
    assertEquals(3, pivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    assertEquals(-1, pivotIndex.pivotIndex(new int[]{1, 2, 3}));
    assertEquals(0, pivotIndex.pivotIndex1(new int[]{2, 1, -1}));

  }

}