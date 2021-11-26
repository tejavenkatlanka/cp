package com.git.t.easy.array;

public class TownJudge {

  public int findJudge(int n, int[][] trust) {
    int[] count = new int[n + 1];
    for (int[] row : trust
    ) {
      count[row[0]]--;
      count[row[1]]++;

    }
    for (int i = 1; i < count.length; i++) {
      if (count[i] == count.length - 1) {
        return i;
      }
    }

    return -1;
  }
}
