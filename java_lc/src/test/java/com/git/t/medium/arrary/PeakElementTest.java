package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PeakElementTest {

  @Test
  void findPeakElement() {
    PeakElement peakElement = new PeakElement();
    assertEquals(2, peakElement.findPeakElement(new int[]{1, 2, 3, 1}));
    assertEquals(5, peakElement.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));


  }
}