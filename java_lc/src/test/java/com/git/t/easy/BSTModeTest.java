package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BSTModeTest {

    @Test
    void findMode() {
        BSTMode mode=new BSTMode();
        assertArrayEquals(new int[]{},mode.findMode(null) );
    }
}