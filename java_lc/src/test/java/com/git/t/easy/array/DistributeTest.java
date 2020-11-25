package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DistributeTest {

  @Test
  void distributeCandies() {
    Distribute distribute = new Distribute();
    assertEquals(3, distribute.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
  }
}