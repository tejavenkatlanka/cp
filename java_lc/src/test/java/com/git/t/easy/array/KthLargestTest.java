package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KthLargestTest {

  @Test
  void add() {
    KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
    assertEquals(4, kthLargest.add(3));

  }
}