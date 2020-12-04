package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindSingleNumberTest {

  @Test
  void singleNumber() {
    FindSingleNumber number = new FindSingleNumber();
    assertEquals(3, number.singleNumber(new int[]{2, 2, 3, 2}));
  }
}