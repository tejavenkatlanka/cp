package com.git.t.easy.string;

public class LowerString {

  public String toLowerCase(String s) {
    if (s == null || s.length() == 0) {
      return s;
    }
    char[] ch = s.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      ch[i] = toLowerChar(ch[i]);
    }
    return new String(ch);
  }

  private char toLowerChar(char ch) {
    if ('A' <= ch && ch <= 'Z') {
      return (char) (ch - 'A' + 'a');
    }
    return ch;
  }
}
