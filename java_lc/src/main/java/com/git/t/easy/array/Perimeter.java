package com.git.t.easy;

public class Perimeter {

  public int islandPerimeter(int[][] grid) {
    int islands = 0, neighbours = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 1) {
          islands++;
          if (i < grid.length - 1 && grid[i + 1][j] == 1) {
            neighbours++;
          }
          if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
            neighbours++;
          }
        }
      }
    }

    return islands * 4 - neighbours * 2;
  }

  public int islandPerimeter2(int[][] grid) {
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 1) {
          count += 4;
          if (i > 0 && grid[i - 1][j] == 1) {
            count -= 2;
          }
          if (j > 0 && grid[i][j - 1] == 1) {
            count -= 2;
          }
        }
      }
    }

    return count;
  }
}
