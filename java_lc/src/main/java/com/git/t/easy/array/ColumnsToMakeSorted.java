package com.git.t.easy.array;

public class ColumnsToMakeSorted {

  public int minDeletionSize(String[] strs) {
    int strLen = strs[0].length();
    int itemLen = strs.length ;
    int count = 0;
    col:
    for (int i = 0; i < strLen; i++) {
      for (int j = 1; j < itemLen; j++) {
        if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
          count++;
          continue col;
        }
      }
    }
    return count;
  }
}
