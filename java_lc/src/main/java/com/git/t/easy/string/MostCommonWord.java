package com.git.t.easy.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

  public String mostCommonWord(String paragraph, String[] banned) {
    Set<String> ban = new HashSet<>(Arrays.asList(banned));
    Map<String, Integer> count = new HashMap<>();
    String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
    for (String w : words) {
      if (!ban.contains(w)) {
        count.put(w, count.getOrDefault(w, 0) + 1);
      }
    }
    return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
}
