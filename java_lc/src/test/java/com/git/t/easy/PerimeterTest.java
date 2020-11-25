package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PerimeterTest {

  @Test
  void islandPerimeter() {
    Perimeter perimeter = new Perimeter();
    assertEquals(4, perimeter.islandPerimeter(new int[][]{{1}}));
    assertEquals(4, perimeter.islandPerimeter(new int[][]{{1, 0}}));
    assertEquals(6, perimeter.islandPerimeter(new int[][]{{1, 1}}));

  }
}