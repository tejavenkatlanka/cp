package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseWordSpacesTest {

  @Test
  void reverseWords() {
    ReverseWordSpaces spaces = new ReverseWordSpaces();
    assertEquals("s'teL ekat edoCteeL tsetnoc", spaces.reverseWords("Let's take LeetCode contest"));

  }
}