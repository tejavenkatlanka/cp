package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountBinaryTest {

  @Test
  void countBinarySubstrings() {
    CountBinary countBinary = new CountBinary();

    assertEquals(6, countBinary.countBinarySubstrings("00110011"));
  }
}