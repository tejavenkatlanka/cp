package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.easy.number.ToHex;

class ToHexTest {

  @org.junit.jupiter.api.Test
  void toHex() {
    ToHex toHex = new ToHex();
    assertEquals("1", toHex.toHex(1));
    assertEquals("a", toHex.toHex(10));

  }
}