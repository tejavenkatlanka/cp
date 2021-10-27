package com.git.t.easy.string;

public class BuddyStrings {

  public boolean buddyStrings(String s, String goal) {
    if (s.length() != goal.length()) {
      return false;
    }
    int first = -1, second = -1, misMatch = 0;
    int[] count = new int[26];

    for (int i = 0; i < s.length(); ++i) {
      count[s.charAt(i) - 'a']++;
      if (s.charAt(i) != goal.charAt(i)) {
        if (first == -1) {
          first = i;
        } else if (second == -1) {
          second = i;
        } else {
          return false;
        }
      }
    }
    if (first != -1 && second != -1) {
      return s.charAt(first) == goal
          .charAt(second) &&
          s.charAt(second) == goal.charAt(first);
    }
    boolean flag = false;
    for (int c : count) {
      if (c > 1) {
        flag = true;
        break;
      }
    }
    return ((first == -1 && second == -1) && flag) ||
        (second != -1);

  }
}
