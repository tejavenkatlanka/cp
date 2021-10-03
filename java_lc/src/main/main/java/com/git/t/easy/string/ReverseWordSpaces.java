package com.git.t.easy.string;

public class ReverseWordSpaces {

  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int left = 0, right = chars.length - 1;
    while (left < right) {
      int leftCur = moveCursorByIgnoringSpace(chars, left);
      int rightCur = moveCursorByIgnoringChar(chars, leftCur + 1);
      if (leftCur >= chars.length || rightCur > chars.length) {
        break;
      }
      reverse(chars, leftCur, rightCur - 1);
      left = rightCur;
    }
    return new String(chars);
  }

  private void reverse(char[] chars, int left, int right) {
    while (left < right) {
      char temp = chars[right];
      chars[right--] = chars[left];
      chars[left++] = temp;
    }
  }

  private int moveCursorByIgnoringSpace(char[] chars, int start) {

    while (start < chars.length && chars[start] == ' ') {
      start++;
    }
    return start;
  }

  private int moveCursorByIgnoringChar(char[] chars, int start) {

    while (start < chars.length && chars[start] != ' ') {
      start++;
    }
    return start;
  }
}
