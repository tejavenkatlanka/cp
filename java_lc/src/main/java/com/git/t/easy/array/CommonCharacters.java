package com.git.t.easy.array;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {

  public List<String> commonChars(String[] words) {
    int[][] hash = new int[words.length][26];
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      for (int j = 0; j < word.length(); j++) {
        hash[i][word.charAt(j) - 'a']++;
      }
    }
    List<String> ret = new ArrayList<>();
    cha:
    for (int i = 0; i < 26; i++) {
      if (hash[0][i] == 0) {
        continue;
      }
      int min = hash[0][i];
      for (int j = 1; j < words.length; j++) {
        min = Math.min(hash[0][i], min);
        if (min == 0) {
          continue cha;
        }
      }
      while (min-- > 0) {
        ret.add(((char) (i + 'a')) + "");
      }
    }
    return ret;
  }
}
