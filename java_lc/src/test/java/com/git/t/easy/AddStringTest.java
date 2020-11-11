package com.git.t.easy;

import com.git.t.easy.string.AddString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddStringTest {

    @Test
    void addStrings() {
        AddString s=new AddString();
       assertEquals("0",s.addStrings("0","0"));
    }
}