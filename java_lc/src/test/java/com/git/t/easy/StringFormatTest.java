package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFormatTest {

    @Test
    void licenseKeyFormatting() {
        StringFormat format=new StringFormat();
        assertEquals("2-5G-3J",format.licenseKeyFormatting("2-5g-3-J",2));
    }
}