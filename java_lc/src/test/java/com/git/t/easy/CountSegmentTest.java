package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSegmentTest {

    @Test
    void countSegments() {
    CountSegment segment=new CountSegment();
    assertEquals(5,segment.countSegments("Hello, my name is John"));
    }
}