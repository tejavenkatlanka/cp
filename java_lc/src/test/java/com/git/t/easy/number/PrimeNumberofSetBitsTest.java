package com.git.t.easy.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimeNumberofSetBitsTest {

  @Test
  void countPrimeSetBits() {
    PrimeNumberofSetBits primeNumberofSetBits = new PrimeNumberofSetBits();
    assertEquals(4, primeNumberofSetBits.countPrimeSetBits(6, 10));
  }
}