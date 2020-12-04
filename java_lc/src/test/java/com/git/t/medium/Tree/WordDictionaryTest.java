package com.git.t.medium.Tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordDictionaryTest {

  @Test
  void search() {
    WordDictionary wordDictionary = new WordDictionary();
    wordDictionary.addWord("one");
    Assertions.assertTrue(wordDictionary.search("..e"));

  }
}