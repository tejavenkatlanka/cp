package com.git.t.easy.array;

public class SmallestLetterGreater {

  public char nextGreatestLetter(char[] letters, char target) {
    int left = 0, right = letters.length - 1;
    if (target >= letters[right]) {
      return letters[left];
    }
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (letters[mid] <= target) {
        left = mid + 1;
      } else {
        right = mid;
      }

    }

    return letters[right];


  }

  public char nextGreatestLetter1(char[] letters, char target) {
    char maxChar = letters[0];
    for (int le = 0; le < letters.length; le++) {
      if (letters[le] > target) {
        maxChar = letters[le];
        break;
      }
    }
    return maxChar;
  }
}
