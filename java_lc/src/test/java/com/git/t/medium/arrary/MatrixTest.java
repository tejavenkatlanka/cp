package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MatrixTest {

  @Test
  void searchMatrix() {
    Matrix matrix = new Matrix();
    assertTrue(matrix.searchMatrix(
        new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}}, 5));
  }
}