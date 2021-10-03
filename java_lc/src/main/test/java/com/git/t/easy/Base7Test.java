package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Base7Test {

  @Test
  void convertToBase7() {
    Base7 seven = new Base7();

    assertEquals("202", seven.convertToBase7(100));
    assertEquals("-10", seven.convertToBase7(-7));
  }
}