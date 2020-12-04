package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class LargestNumberTest {

  @Test
  void largestNumber() {
    LargestNumber largestNumber = new LargestNumber();
    assertEquals("210", largestNumber.largestNumber(new int[]{10, 2}));
  }
}