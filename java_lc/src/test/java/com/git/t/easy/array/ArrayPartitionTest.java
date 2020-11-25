package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArrayPartitionTest {

  @Test
  void arrayPairSum() {
    ArrayPartition arrayPartition = new ArrayPartition();
    assertEquals(4, arrayPartition.arrayPairSum(new int[]{1, 4, 3, 2}));
  }
}