package com.git.t.easy.array;

public class ImageSmoother {


  public int[][] imageSmoother(int[][] M) {
    int m = M.length;
    int n = M[0].length;

    int[][] result = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        result[i][j] = smooth(M, i, j);
      }
    }

    return result;
  }

  private int smooth(int[][] matrix, int i, int j) {
    int m = matrix.length;
    int n = matrix[0].length;

    int count = 1;
    int sum = matrix[i][j];

    if (j - 1 >= 0) {
      sum += matrix[i][j - 1];
      count++;

      if (i - 1 >= 0) {
        sum += matrix[i - 1][j - 1];
        count++;
      }

      if (i + 1 < m) {
        sum += matrix[i + 1][j - 1];
        count++;
      }
    }

    if (i - 1 >= 0) {
      sum += matrix[i - 1][j];
      count++;
    }

    if (i + 1 < m) {
      sum += matrix[i + 1][j];
      count++;
    }

    if (j + 1 < n) {
      sum += matrix[i][j + 1];
      count++;

      if (i - 1 >= 0) {
        sum += matrix[i - 1][j + 1];
        count++;
      }

      if (i + 1 < m) {
        sum += matrix[i + 1][j + 1];
        count++;
      }
    }

    return sum / count;
  }
}
