package com.git.t.easy.string;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderData {

  public String[] reorderLogFiles(String[] logs) {
    Comparator<String> myComp = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        int s1SpaceIndex = s1.indexOf(' ');
        int s2SpaceIndex = s2.indexOf(' ');
        boolean s1FirstCharacterIsNumeric = s1.charAt(s1SpaceIndex + 1) <= '9';
        boolean s2FirstCharacterIsNumeric = s2.charAt(s2SpaceIndex + 1) <= '9';

        if (s1FirstCharacterIsNumeric) {
          if (s2FirstCharacterIsNumeric) {
            return 0;
          } else {
            return 1;
          }
        } else if (s2FirstCharacterIsNumeric) {
          return -1;
        }

        int preCompute = s1.substring(s1SpaceIndex + 1).compareTo(s2.substring(s2SpaceIndex + 1));
        if (preCompute == 0) {
          return s1.substring(0, s1SpaceIndex).compareTo(s2.substring(0, s2SpaceIndex));
        }
        return preCompute;
      }
    };

    Arrays.sort(logs, myComp);
    return logs;
  }
}
