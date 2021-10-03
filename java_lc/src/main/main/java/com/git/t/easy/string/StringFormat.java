package com.git.t.easy;

public class StringFormat {

  public String licenseKeyFormatting(String s, int k) {
    StringBuilder builder = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) != '-') {
        builder.append(builder.length() % (k + 1) == k ? '-' : "")
            .append(Character.toUpperCase(s.charAt(i)));
      }
    }
    return builder.reverse().toString();
  }
}
