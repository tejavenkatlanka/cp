package com.git.t.medium.arrary;

import java.util.LinkedList;
import java.util.List;

public class RottingOranges {

  public static void main(String[] args) {
    System.out
        .println(new RottingOranges().orangesRotting(new int[][]{{
            0
        }}));

  }

  public int orangesRotting(int[][] grid) {
    LinkedList<int[]> rottenList = getRottenOrages(grid, 2);

    int count = 0;
    int i = rottenList.size();
    while (i > 0) {
      int rottenCount = 0;
      for (int j = 0; j < i; j++) {
        int[] index = rottenList.removeFirst();

        if (mark(index[0] - 1, index[1], grid, rottenList)) {
          rottenCount++;
        }
        if (mark(index[0] + 1, index[1], grid, rottenList)) {
          rottenCount++;
        }
        if (mark(index[0], index[1] - 1, grid, rottenList)) {
          rottenCount++;
        }
        if (mark(index[0], index[1] + 1, grid, rottenList)) {
          rottenCount++;
        }
      }
      if (rottenCount > 0) {
        count++;
      }
      i = rottenList.size();

    }
    List<int[]> list = getRottenOrages(grid, 1);
    return list.size() > 0 ? -1 : count;
  }

  private boolean mark(int i, int j, int[][] grid, List<int[]> list) {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != 1) {

      return false;
    }
    grid[i][j] = 2;
    list.add(new int[]{i, j});
    return true;
  }

  private LinkedList<int[]> getRottenOrages(int[][] grid, int mode) {
    LinkedList<int[]> list = new LinkedList<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == mode) {
          list.add(new int[]{i, j});
        }
      }
    }
    return list;
  }


}
