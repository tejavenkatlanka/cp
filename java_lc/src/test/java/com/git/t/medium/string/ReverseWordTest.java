package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseWordTest {

  @Test
  void reverseWords() {
    ReverseWord reverseWord = new ReverseWord();
    assertEquals("the sky is blue", reverseWord.reverseWords("blue is sky the"));
    assertEquals("world hello", reverseWord.reverseWords("  hello world  "));
    assertEquals("example good a", reverseWord.reverseWords("a good   example"));


  }
}