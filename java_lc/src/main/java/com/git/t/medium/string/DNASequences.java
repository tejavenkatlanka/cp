package com.git.t.medium.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DNASequences {

  public List<String> findRepeatedDnaSequences(String s) {
    Set<String> seen = new HashSet<>(), repeated = new HashSet<>();

    for (int i = 0; i+ 9 < s.length() ; i++) {
      String temp = s.substring(i, i + 10);
      if (!seen.add(temp)) {
        repeated.add(temp);
      }

    }
    return new ArrayList<>(repeated);
  }
  private static final Map<Character, Integer> A = new HashMap<>();
  static { A.put('A',0); A.put('C',1); A.put('G',2); A.put('T',3); }
  private final int A_SIZE_POW_9 = (int) Math.pow(A.size(), 9);

  public List<String> findRepeatedDnaSequences1(String s) {
    Set<String> res = new HashSet<>();
    Set<Integer> hashes = new HashSet<>();
    for (int i = 0, rhash = 0; i < s.length(); i++) {
      if (i > 9) rhash -= A_SIZE_POW_9 * A.get(s.charAt(i-10));
      rhash = A.size() * rhash + A.get(s.charAt(i));
      if (i > 8 && !hashes.add(rhash)) res.add(s.substring(i-9,i+1));
    }
    return new ArrayList<>(res);
  }
}
