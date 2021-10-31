package com.git.t.easy.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {

  public String[] uncommonFromSentences(String A, String B) {
    Map<String, Integer> count = new HashMap<>();
    for (String w : (A + " " + B).split(" "))
      count.put(w, count.getOrDefault(w, 0) + 1);
    ArrayList<String> res = new ArrayList<>();
    for (String w : count.keySet())
      if (count.get(w) == 1)
        res.add(w);
    return res.toArray(new String[0]);
  }
  public String[] uncommonFromSentences1(String s1, String s2) {
    Map<String, Integer> s1Map = getStringCount(s1);
    Map<String, Integer> s2Map = getStringCount(s2);
    for (String key : s2Map.keySet()
    ) {
      s1Map.put(key, s1Map.getOrDefault(key, 0) + s2Map.get(key));
    }
    List<String> unMatched = new ArrayList<>();
    for (String key : s1Map.keySet()) {
      if (s1Map.get(key) < 2) {
        unMatched.add(key);
      }
    }

    return unMatched.toArray(String[]::new);
  }

  private Map<String, Integer> getStringCount(String string) {
    Map<String, Integer> map = new HashMap<>();
    for (String word : string.split(" ")) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    return map;
  }
}
