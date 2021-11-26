package com.git.t.medium;

import java.util.LinkedList;
import java.util.List;

public class CombinationIterator {

  LinkedList<String> combination;

  public CombinationIterator(String characters, int combinationLength) {
    combination = new LinkedList<>();
    helper(combination, characters, new StringBuilder(), 0, combinationLength);
  }

  public static void main(String[] args) {
    CombinationIterator iterator = new CombinationIterator("abc", 2);

    System.out.println(iterator.next());
  }

  private void helper(List<String> combinations, String characters, StringBuilder builder,
      int index, int count) {
    int com = 1 << characters.length();

    for (int i = 1; i < com; i++) {
      int n = i, comb = 0;
      while (n != 0) {
        if ((n & 1) == 1) {
          builder.append(characters.charAt(comb));
        }
        comb++;
        n >>= 1;

      }
      if (builder.length() == count) {
        combinations.add(builder.toString());
      }
      builder = new StringBuilder();

    }


  }

  private void helper1(List<String> combinations, String characters, StringBuilder builder,
      int index, int count) {
    if (index >= characters.length()) {
      return;
    }
    if (count == 0) {
      combinations.add(builder.toString());
      return;
    }
    for (int i = index; i <= characters.length() - count; i++) {
      builder.append(characters.charAt(i));
      helper(combinations, characters, builder, i + 1, count - 1);
      builder.deleteCharAt(builder.length() - 1);


    }


  }

  public String next() {
    return combination.poll();
  }

  public boolean hasNext() {
    return !combination.isEmpty();
  }
}
