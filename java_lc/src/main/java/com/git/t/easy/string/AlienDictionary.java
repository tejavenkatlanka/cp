package com.git.t.easy.string;

public class AlienDictionary {

  public boolean isAlienSorted(String[] words, String order) {

    int[] orderIndex = new int[26];
    for (int i = 0; i < order.length(); i++) {
      orderIndex[order.charAt(i) - 'a'] = i;
    }

    for (int i = 1; i < words.length; i++) {

      String left = words[i - 1];
      String right = words[i];
      int index = 0, count = 0;
      while (index < left.length() && index < right.length()) {
        int dif = orderIndex[right.charAt(index) - 'a'] - orderIndex[left.charAt(index) - 'a'];
        count += dif;
        index++;

        if (dif > 0) {
          break;
        } else if (dif < 0) {
          return false;
        }
      }
      if (count == 0 && left.length() > right.length()) {
        return false;
      }
    }

    return true;
  }
}
