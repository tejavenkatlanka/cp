package com.git.t.hard;

public class UniquePathsIII {

  int res = 0, empty = 1, sx, sy;

  public int uniquePathsIII(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 0) {
          empty++;
        } else if (grid[i][j] == 1) {
          sx = i;
          sy = j;
        }
      }
    }
    df(grid, sx, sy);
    return res;
  }

  private void df(int[][] grid, int x, int y) {
    if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] < 0) {
      return;
    }
    if (grid[x][y] == 2) {
      if (empty == 0) {
        res++;
      }
      return;
    }
    grid[x][y] = -2;
    empty--;
    df(grid, x - 1, y);
    df(grid, x + 1, y);
    df(grid, x, y - 1);
    df(grid, x, y + 1);

    empty++;
    grid[x][y] = 0;


  }

}
