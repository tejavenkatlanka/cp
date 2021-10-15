package com.git.t.easy.number;

public class NumberofLinesToWriteString {

  int max = 100;

  public int[] numberOfLines(int[] widths, String s) {
    int res = 1, cur = 0;
    for (char c : s.toCharArray()) {
      int width = widths[c - 'a'];
      res = cur + width > 100 ? res + 1 : res;
      cur = cur + width > 100 ? width : cur + width;
    }
    return new int[] {res, cur};
  }

}
