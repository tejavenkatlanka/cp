package com.git.t.easy.array.matrix;

public class ToeplitzMatrix {

  public boolean isToeplitzMatrix(int[][] matrix) {

    for (int i = 0; i < matrix.length - 1; i++) {
      for (int j = 0; j < matrix[i].length - 1; j++) {
        if (matrix[i - 1][j - 1] != matrix[i][j]) {
          return false;
        }
      }
    }

    return true;
  }
}
