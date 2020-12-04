package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

  @Test
  void reverseStr() {
    ReverseString reverseString = new ReverseString();
    assertEquals("bacdfeg", reverseString.reverseStr("abcdefg", 2));
  }
}