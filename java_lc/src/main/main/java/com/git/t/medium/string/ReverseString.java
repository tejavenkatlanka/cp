package com.git.t.medium.string;

public class ReverseString {

  public String reverseStr(String s, int k) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i += k * 2) {
      int in = i, max = Math.min(i + k - 1, chars.length - 1);
      while (in < max) {
        char te = chars[max];
        chars[max] = chars[in];
        chars[in] = te;
        max--;
        in++;
      }

    }
    return new String(chars);
  }
}
