package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

  @Test
  void singleNumber() {
    SingleNumber singleNumber = new SingleNumber();
    assertArrayEquals(new int[]{5, 3}, singleNumber.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
  }
}