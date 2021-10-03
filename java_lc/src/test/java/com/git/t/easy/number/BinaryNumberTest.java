package com.git.t.easy.number;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BinaryNumberTest {

  @Test
  void hasAlternatingBits() {
    BinaryNumber binaryNumber = new BinaryNumber();
    assertTrue(binaryNumber.hasAlternatingBits(5));
  }
}