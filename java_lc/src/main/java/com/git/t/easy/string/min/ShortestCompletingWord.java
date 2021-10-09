package com.git.t.easy.string.min;

public class ShortestCompletingWord {

  public String shortestCompletingWord(String licensePlate, String[] words) {
    int[] chars = getcharArray(licensePlate);
    int minLength = 16;
    String ret = null;
    for (String word : words) {
      if (minLength > word.length()) {
        boolean match = isMatch(chars, word);
        if (match) {
          minLength = word.length();
          ret = word;
        }
      }
    }
    return ret;
  }

  private boolean isMatch(int[] chars, String word) {
    int[] tempChar = chars.clone();
    for (char ch : word.toCharArray()) {
      tempChar[ch - 'a']--;
    }
    for (int i : tempChar) {
      if (i > 0) {
        return false;
      }
    }
    return true;
  }

  private int[] getcharArray(String word) {
    int[] chars = new int[26];
    for (char ch : word.toCharArray()) {
      if (ch >= 65 && ch <= 90) {
        chars[ch - 'A']++;
      } else if (ch >= 97 && ch <= 121) {
        chars[ch - 'a']++;

      }
    }
    return chars;
  }
}
