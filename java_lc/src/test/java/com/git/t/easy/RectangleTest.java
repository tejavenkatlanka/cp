package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest {

  @Test
  void constructRectangle() {
    Rectangle rectangle = new Rectangle();
    assertEquals(new int[]{2, 2}, rectangle.constructRectangle(4));
  }
}