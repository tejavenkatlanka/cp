package com.git.t.easy.string;

public class ReverseOnlyLetters {

  public String reverseOnlyLetters(String s) {

    int left = 0, right = s.length() - 1;
    char[] chars = s.toCharArray();
    while (true) {

      while (left < s.length() && !Character.isAlphabetic(s.charAt(left))) {
        left++;
      }

      while (right >= 0 && !Character.isAlphabetic(s.charAt(right))) {
        right--;
      }

      if (left >= right) {
        break;
      }
      char temp = chars[right];
      chars[right] = chars[left];
      chars[left] = temp;
      right--;
      left++;


    }
    return new String(chars);


  }


}
