package com.git.t.medium.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BitwiseANDofNumbersRangeTest {

  @Test
  void rangeBitwiseAnd() {
    BitwiseANDofNumbersRange bitwiseANDofNumbersRange = new BitwiseANDofNumbersRange();

    assertEquals(4, bitwiseANDofNumbersRange.rangeBitwiseAnd(5, 7));
  }
}