package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.easy.string.CountSegment;
import org.junit.jupiter.api.Test;

class CountSegmentTest {

  @Test
  void countSegments() {
    CountSegment segment = new CountSegment();
    assertEquals(5, segment.countSegments("Hello, my name is John"));
  }
}