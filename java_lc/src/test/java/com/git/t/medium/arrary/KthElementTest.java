package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KthElementTest {

  @Test
  void findKthLargest() {
    KthElement kthElement = new KthElement();
    assertEquals(5, kthElement.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
  }
}