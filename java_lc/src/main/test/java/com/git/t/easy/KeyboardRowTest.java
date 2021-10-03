package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KeyboardRowTest {

  @Test
  void findWords() {

    KeyboardRow row = new KeyboardRow();

    assertArrayEquals(new String[]{"Alaska", "Dad"},
        row.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));


  }
}