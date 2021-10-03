package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UglyNumberTest {

  @Test
  void nthUglyNumber() {
    UglyNumber uglyNumber = new UglyNumber();
    assertEquals(12, uglyNumber.nthUglyNumber(10));
  }
}