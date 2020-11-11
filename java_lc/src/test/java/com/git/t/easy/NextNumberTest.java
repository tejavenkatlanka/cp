package com.git.t.easy;

import com.git.t.easy.array.NextNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NextNumberTest {

    @Test
    void nextGreaterElement() {
        assertArrayEquals(new int[]{-1, 3, -1}, new NextNumber().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }
}