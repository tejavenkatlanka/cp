package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NonDecreasingArrayTest {

  @Test
  void checkPossibility() {
    NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
    assertTrue(nonDecreasingArray.checkPossibility(new int[]{4, 2, 3}));
  }
}