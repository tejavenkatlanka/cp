package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestContinuesArrayTest {

  @Test
  void findLengthOfLCIS() {
    LongestContinuesArray continuesArray = new LongestContinuesArray();
    assertEquals(3, continuesArray.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
  }

  @Test
  void findLengthOfLCISSlide() {
    LongestContinuesArray continuesArray = new LongestContinuesArray();
    assertEquals(3, continuesArray.findLengthOfLCISSlide(new int[]{1, 3, 5, 4, 7}));
  }
}