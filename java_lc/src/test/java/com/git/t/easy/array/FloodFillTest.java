package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class FloodFillTest {

  @Test
  void floodFill() {
    FloodFill floodFill = new FloodFill();

    int[][] act = floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
    int[][] expected = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
    assertArrayEquals(expected, act);

    int[][] act1 = floodFill.floodFill(new int[][]{{0,0,0}, {0, 1, 1}}, 1, 1, 1);
    int[][] expected1 = new int[][]{{0,0,0}, {0, 1, 1}};
    assertArrayEquals(expected1, act1);

  }

}