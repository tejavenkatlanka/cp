package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LowerStringTest {

  @Test
  void toLowerCase() {
    LowerString string = new LowerString();

    assertEquals("hi", string.toLowerCase("Hi"));
  }
}