package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringTest {

    @Test
    void addStrings() {
        AddString s=new AddString();
       assertEquals("0",s.addStrings("0","0"));
    }
}