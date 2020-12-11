package com.git.t.easy.string;

public class RobotReturn {

  public boolean judgeCircle(String moves) {
    int res = 0;
    int[] arr = new int[26];
    arr['U' - 'A'] = -1;
    arr['D' - 'A'] = 1;
    arr['L' - 'A'] = -9;
    arr['R' - 'A'] = 9;

    for (char ch : moves.toCharArray()) {
      res += arr[ch - 'A'];
    }

    return res == 0;
  }
}
