package com.git.t.easy.array;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

  public static void main(String[] args) {
    new UniqueEmailAddresses()
        .numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"});
  }

  public int numUniqueEmails(String[] emails) {
    if (emails == null) {
      return 0;
    }

    Set<String> addresses = new HashSet<>();

    for (String email : emails) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < email.length(); i++) {
        char ch = email.charAt(i);
        switch (ch) {
          case '.':
            break;
          case '+':
            while (ch != '@') {
              ch = email.charAt(++i);
            }
            sb.append(email.substring(i));
            i = email.length();
            break;
          case '@':
            sb.append(email.substring(i));
            i = email.length();
            break;

          default:
            sb.append(ch);
        }
      }
      addresses.add(sb.toString());
    }
    System.out.println(addresses);

    return addresses.size();
  }
  public int numUniqueEmails1(String[] emails) {
    Set<String> set = new HashSet<>();
    for (String email : emails
    ) {
      set.add(getUniqueEmail(email));
    }
    System.out.println(set);
    return set.size();
  }

  private String getUniqueEmail(String name) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < name.length() && (name.charAt(i) != '+' && name.charAt(i) != '@'); i++) {
      if (name.charAt(i) != '.') {
        builder.append(name.charAt(i));
      }
    }
    builder.append(name.substring(name.lastIndexOf("@")));
    return builder.toString();
  }
}
