package com.git.t.easy.string;

public class CountBinary {

  public int countBinarySubstrings(String s) {
    int curr = 1, pre = 0, res = 0;

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        curr++;
      } else {
        res += Math.min(curr, pre);
        pre = curr;
        curr = 1;

      }
    }
    return res + Math.min(curr, pre);
  }

}
