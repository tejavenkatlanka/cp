package com.git.t.easy.array.min;

public class ShortestDistancetoaCharacter {

  public int[] shortestToChar(String s, char c) {

    int[] ans = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        ans[i] = 0;
      } else {
        ans[i] = ans.length;
      }

    }
    for (int i = 1; i < ans.length; i++) {
      ans[i] = Math.min(ans[i], ans[i - 1] + 1);
    }
    for (int i = ans.length - 2; i >= 0; i--) {
      ans[i] = Math.min(ans[i], ans[i + 1] + 1);
    }

    return ans;

  }
}
