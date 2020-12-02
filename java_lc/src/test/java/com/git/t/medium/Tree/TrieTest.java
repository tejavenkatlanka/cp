package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TrieTest {

  @Test
  void insert() {
    Trie trie = new Trie();
    trie.insert("apple");
    assertTrue(trie.search("apple"));   // returns true
    assertFalse(trie.search("app"));     // returns false
    assertTrue(trie.startsWith("app")); // returns true
    trie.insert("app");
    assertTrue(trie.search("app"));     // returns true
  }
}