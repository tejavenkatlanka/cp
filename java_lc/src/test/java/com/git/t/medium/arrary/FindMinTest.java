package com.git.t.medium.arrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinTest {

    @Test
    void findMin() {
        FindMin findMin=new FindMin();
        assertEquals(1,findMin.findMin(new int[]{ 3,4,5,1,2})
        );
    }
}