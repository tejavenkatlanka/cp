package com.git.t.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void reverseStr() {
        ReverseString reverseString=new ReverseString();
        assertEquals("bacdfeg",reverseString.reverseStr("abcdefg",2));
    }
}