package com.git.t.medium.Tree;

public class WordDictionary {

  WordDictionary.TrieNode head = new WordDictionary.TrieNode();


  public void addWord(String word) {
    WordDictionary.TrieNode node = head;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (!node.containsKey(ch)) {
        node.put(ch, new WordDictionary.TrieNode());
      }
      node = node.get(ch);
    }
    node.setEnd();
  }

  public boolean search(String word) {
    return match(word.toCharArray(), 0, head);
  }

  private boolean match(char[] chars, int start, TrieNode trieNode) {
    if (chars.length == start) {
      return trieNode.isEnd;
    }
    if (chars[start] == '.') {
      for (int i = 0; i < trieNode.links.length; i++) {
        if (trieNode.links[i] != null && match(chars, start + 1, trieNode.links[i])) {
          return true;
        }
      }
    } else {
      return trieNode.get(chars[start]
      ) != null && match(chars, start + 1,
          trieNode.get(chars[start]));
    }
    return false;

  }

  static class TrieNode {

    private final int R = 26;
    // R links to node children
    private final WordDictionary.TrieNode[] links;
    private boolean isEnd;

    public TrieNode() {
      links = new WordDictionary.TrieNode[R];
    }

    public boolean containsKey(char ch) {
      return links[ch - 'a'] != null;
    }

    public WordDictionary.TrieNode get(char ch) {
      return links[ch - 'a'];
    }

    public void put(char ch, WordDictionary.TrieNode node) {
      links[ch - 'a'] = node;
    }

    public void setEnd() {
      isEnd = true;
    }

    public boolean isEnd() {
      return isEnd;
    }

  }
}
