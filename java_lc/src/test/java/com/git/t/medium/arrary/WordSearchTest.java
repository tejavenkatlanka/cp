package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordSearchTest {

  @Test
  void exist() {
    WordSearch wordSearch=new WordSearch();
    assertTrue(wordSearch.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
    
  }
}