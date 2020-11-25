package com.git.t.easy.number;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PerfectNumberTest {

  @Test
  void checkPerfectNumber() {
    PerfectNumber number = new PerfectNumber();

    assertTrue(number.checkPerfectNumber(6));
  }
}