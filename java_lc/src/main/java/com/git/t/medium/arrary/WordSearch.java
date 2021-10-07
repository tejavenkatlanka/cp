package com.git.t.medium.arrary;

public class WordSearch {

  public boolean exist(char[][] board, String word) {
    char[] wordMatch = word.toCharArray();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == wordMatch[0] && helper(board, i, j, wordMatch, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean helper(char[][] board, int i, int j, char[] word, int index) {

    if (word.length == index) {
      return true;
    }
    if (i < 0 || j < 0 || i == board.length || j == board[i].length || board[i][j] != word[index]) {
      return false;
    }
    board[i][j] ^= 256;
    boolean exist = helper(board, i - 1, j, word, index + 1) ||
        helper(board, i + 1, j, word, index + 1) ||
        helper(board, i, j - 1, word, index + 1) ||
        helper(board, i, j + 1, word, index + 1);
    board[i][j] ^= 256;

    return exist;

  }

}
