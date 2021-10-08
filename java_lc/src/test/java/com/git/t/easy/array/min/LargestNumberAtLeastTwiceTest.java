package com.git.t.easy.array.min;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestNumberAtLeastTwiceTest {

  @Test
  void dominantIndex() {
    LargestNumberAtLeastTwice largestNumberAtLeastTwice=new LargestNumberAtLeastTwice();
    assertEquals(0,largestNumberAtLeastTwice.dominantIndex(new int[]{1}));

    assertEquals(1,largestNumberAtLeastTwice.dominantIndex(new int[]{3,6,1,0}));
    assertEquals(-1,largestNumberAtLeastTwice.dominantIndex(new int[]{1,2,3,4}));



  }
}