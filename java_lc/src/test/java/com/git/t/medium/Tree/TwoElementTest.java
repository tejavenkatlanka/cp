package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TwoElementTest {

  @Test
  void containsNearbyAlmostDuplicate() {
    TwoElement twoElement = new TwoElement();

    assertTrue(twoElement.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
  }
}