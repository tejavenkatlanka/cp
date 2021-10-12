package com.git.t.medium.arrary;

public class InterleavingString {

  public boolean isInterleave(String s1, String s2, String s3) {
    return helper(s1, 0, s2, 0, "", s3);
  }

  public boolean helper(String s1, int i1, String s2, int i2, String re, String s3) {
    if (re.equals(s3) && i1 == s1.length() && i2 == s2.length()) {
      return true;
    }
    boolean flag = false;

    if (i1 < s1.length()) {
      flag |= helper(s1, i1 + 1, s2, i2, re + s1.charAt(i1), s3);
    }
    if (i2 < s2.length()) {
      flag |= helper(s1, i1, s2, i2 + 1, re + s2.charAt(i2), s3);
    }

    return flag;
  }

}
