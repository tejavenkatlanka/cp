package com.git.t.easy.array.matrix;

public class TransposeMatrix {

  public int[][] transpose(int[][] matrix) {
    int[][] transpose = new int[matrix[0].length][matrix.length];
    int col = 0;
    for (int[] row : matrix
    ) {
      for (int i = 0; i < row.length; i++) {
        transpose[i][col] = row[i];
      }
      col++;
    }

    return matrix;
  }
}
