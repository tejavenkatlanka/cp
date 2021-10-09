package com.git.t.hard;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

  public List<String> findWords(char[][] board, String[] words) {
    TrieNode head = buildTrie(words);
    List<String> list = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        helper(board, i, j, head, list);
      }
    }
    return list;

  }

  private boolean helper(char[][] board, int i, int j, TrieNode node, List<String> matched) {

    if (i < 0 || i >= board.length || j < 0 || j >= board[i].length) {
      return false;
    }
    if (board[i][j] < 97 || board[i][j] > 121 || node.next[board[i][j] - 'a'] == null) {
      return false;
    }
    node = node.next[board[i][j] - 'a'];
    if (node.word != null) {
      matched.add(node.word);
      node.word = null;
    }

    board[i][j] ^= 256;
    helper(board, i - 1, j, node, matched);
    helper(board, i + 1, j, node, matched);
    helper(board, i, j - 1, node, matched);
    helper(board, i, j + 1, node, matched);
    board[i][j] ^= 256;

    return true;


  }

  public TrieNode buildTrie(String[] words) {
    TrieNode head = new TrieNode();
    for (int i = 0; i < words.length; i++) {
      TrieNode cu = head;
      for (char ch : words[i].toCharArray()) {
        int ind = ch - 'a';
        if (cu.next[ind] == null) {
          cu.next[ind] = new TrieNode();
        }
        cu = cu.next[ind];
      }
      cu.word = words[i];

    }
    return head;
  }

  public List<String> findWords1(char[][] board, String[] words) {
    List<int[]>[] index = new List[26];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        List<int[]> item = index[board[i][j] - 'a'];
        if (item == null) {
          item = new ArrayList<>();
          index[board[i][j] - 'a'] = item;
        }
        item.add(new int[]{i, j});

      }
    }
    List<String> ret = new ArrayList<>();
    for (String word : words) {
      List<int[]> ind = index[word.charAt(0) - 'a'];
      if (ind != null) {
        for (int[] in : ind) {
          if (isMatch(board, in[0], in[1], word.toCharArray(), 0)) {
            ret.add(word);
            break;
          }
        }
      }
    }
    return ret;

  }

  private boolean isMatch(char[][] board, int i, int j, char[] word, int index) {
    if (index == word.length) {
      return true;
    }

    if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word[index]) {
      return false;
    }
    board[i][j] ^= 256;
    boolean match = isMatch(board, i - 1, j, word, index + 1) ||
        isMatch(board, i + 1, j, word, index + 1) ||
        isMatch(board, i, j - 1, word, index + 1) ||
        isMatch(board, i, j + 1, word, index + 1);
    board[i][j] ^= 256;

    return match;


  }

  class TrieNode {

    TrieNode[] next = new TrieNode[26];
    String word;
  }

}
