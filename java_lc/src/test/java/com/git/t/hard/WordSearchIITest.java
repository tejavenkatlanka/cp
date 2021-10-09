package com.git.t.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class WordSearchIITest {

  @Test
  void findWords() {
    WordSearchII wordSearchII = new WordSearchII();
    assertEquals(List.of( "oath","eat"), wordSearchII.findWords(
        new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}}, new String[]{"oath", "pea", "eat", "rain"}));
    assertEquals(List.of(), wordSearchII.findWords(
        new char[][]{{'a', 'a'}}, new String[]{"aaa"}));


  }
}