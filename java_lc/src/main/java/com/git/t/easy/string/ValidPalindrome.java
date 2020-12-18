package com.git.t.easy.string;

public class ValidPalindrome {

  public boolean validPalindrome(String s) {
    int l = 0, r = s.length() - 1;
    while (l < r) {
      if (s.charAt(l) == s.charAt(r)) {
        l++;
        r--;
      } else {
        return isPalindrome(s, l, r - 1) || isPalindrome(s, l + 1, r);
      }

    }
    return true;
  }

  public boolean isPalindrome(String s, int l, int r) {
    while (l < r) {
      if (s.charAt(l) == s.charAt(r)) {
        l++;
        r--;
      } else {
        return false;
      }
    }
    return true;
  }
}
