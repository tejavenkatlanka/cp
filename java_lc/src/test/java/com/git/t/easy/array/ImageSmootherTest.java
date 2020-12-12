package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ImageSmootherTest {

  @Test
  void imageSmoother() {
    ImageSmoother imageSmoother = new ImageSmoother();
    assertArrayEquals(new int[][]{{0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}}, imageSmoother.imageSmoother(new int[][]{{1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}}));
  }
}