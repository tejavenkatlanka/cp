package com.git.t.easy.string;

public class ScoreBoard {

  public int calPoints(String[] ops) {
    if (ops == null) {
      return 0;
    }
    int total = 0;
    int[] map = new int[ops.length];
    int index = -1;
    for (int i = 0; i < ops.length; i++) {
      String s = ops[i];
      switch (s) {
        case "+":
          map[++index] = map[index - 1] + map[index - 2];
          total += map[index];
          break;
        case "D":
          map[++index] = 2 * map[index - 1];
          total += map[index];
          break;
        case "C":
          total -= map[index];
          index--;
          break;
        default:
          map[++index] = Integer.parseInt(s);
          total += map[index];
      }
    }
    return total;
  }
}
