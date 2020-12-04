package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FractionToDecimalTest {

  @Test
  void fractionToDecimal() {
    FractionToDecimal fractionToDecimal = new FractionToDecimal();

    assertEquals("0.5", fractionToDecimal.fractionToDecimal(1, 2));

  }
}