package com.git.t.easy.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {

  String[] strings = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
      ".--", "-..-", "-.--", "--.."};

  public int uniqueMorseRepresentations(String[] words) {
    Set<String> patters = new HashSet<>();
    for (String word : words
    ) {
      StringBuilder builder = new StringBuilder();

      for (char ch : word.toCharArray()
      ) {
        builder.append(strings[ch - 'a']);
      }
      patters.add(builder.toString());
    }
    return patters.size();
  }
}
