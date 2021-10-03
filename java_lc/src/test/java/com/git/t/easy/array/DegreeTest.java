package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DegreeTest {

  @Test
  void findShortestSubArray() {
    Degree degree = new Degree();

    assertEquals(2, Degree.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
  }
}