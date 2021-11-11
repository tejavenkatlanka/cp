package com.git.t.easy.array;

public class LongPressedName {

  public boolean isLongPressedName(String name, String typed) {
    int i = 0;
    for (int j = 0; j < typed.length(); j++) {
      if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
        i++;
      } else if (j == 0 || typed.charAt(j - 1) != typed.charAt(j)) {
        return false;
      }

    }
    return i == name.length();
  }

  public boolean isLongPressedName1(String name, String typed) {
    int i = 0, j = 0;
    while (i < name.length() && j < typed.length()) {
      char c1 = name.charAt(i);
      int iCount = 0;
      while (i < name.length() && name.charAt(i) == c1) {
        i++;
        iCount++;
      }
      int jCount = 0;
      while (j < typed.length() && typed.charAt(j) == c1) {
        j++;
        jCount++;
      }

      if (iCount > jCount) {
        return false;
      }


    }

    return (i == name.length() && j == typed.length());
  }
}
