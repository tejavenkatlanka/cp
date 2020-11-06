package com.git.t.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindSingleNumberTest {

    @Test
    void singleNumber() {
        FindSingleNumber number=new FindSingleNumber();
        assertEquals(3,number.singleNumber(new int[]{2,2,3,2}));
    }
}