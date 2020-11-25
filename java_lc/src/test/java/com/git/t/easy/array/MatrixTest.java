package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MatrixTest {

  @Test
  void matrixReshape() {
    Matrix matrix = new Matrix();
    assertArrayEquals(new int[][]{{1, 2, 3, 4}},
        matrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
  }
}