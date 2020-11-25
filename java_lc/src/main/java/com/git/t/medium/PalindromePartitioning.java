package com.git.t.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

  public List<List<String>> partition(String s) {
    List<List<String>> response = new ArrayList<>();
    boolean dp[][] = new boolean[s.length()][s.length()];
    partitionHelperDp(dp, 0, response, s.toCharArray(), new ArrayList<String>());
    return response;
  }

  private void partitionHelperDp(boolean[][] dp, int start, List<List<String>> response,
      char[] toCharArray, ArrayList<String> current) {
    if (start >= toCharArray.length) {
      response.add(new ArrayList<>(current));
    }
    for (int end = start; end < toCharArray.length; end++) {
      if ((toCharArray[start] == toCharArray[end]) && (end - start <= 2 || dp[start + 1][end
          - 1])) {
        dp[start][end] = true;
        current.add(new String(toCharArray, start, end - start + 1));
        partitionHelperDp(dp, end + 1, response, toCharArray, current);
        current.remove(current.size() - 1);
      }

    }


  }

  public List<List<String>> partition1(String s) {
    List<List<String>> response = new ArrayList<>();

    partitionHelper(0, response, s.toCharArray(), new ArrayList<String>());
    return response;
  }

  private void partitionHelper(int start, List<List<String>> response, char[] charSeq,
      ArrayList<String> current) {
    if (start >= charSeq.length) {
      response.add(new ArrayList<>(current));
    }
    for (int end = start; end < charSeq.length; end++) {

      if (isPalindrome(start, end, charSeq)) {
        current.add(new String(charSeq, start, end - start + 1));
        partitionHelper(end + 1, response, charSeq, current);
        current.remove(current.size() - 1);
      }

    }
  }

  private boolean isPalindrome(int start, int end, char[] string) {
    while (start < end) {
      if (string[start++] != string[end--]) {
        return false;
      }
    }
    return true;
  }
}
