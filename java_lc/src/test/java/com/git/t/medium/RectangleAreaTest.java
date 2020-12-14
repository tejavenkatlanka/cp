package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleAreaTest {

  @Test
  void computeArea() {
    RectangleArea area = new RectangleArea();

    assertEquals(45, area.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
  }
}