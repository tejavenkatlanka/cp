package com.git.t.medium.arrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeakElementTest {

    @Test
    void findPeakElement() {
    PeakElement peakElement=new PeakElement();
    assertEquals(2,peakElement.findPeakElement(new int[]{1,2,3,1}));
        assertEquals(1,peakElement.findPeakElement(new int[]{ 1,2,1,3,5,6,4}));


    }
}