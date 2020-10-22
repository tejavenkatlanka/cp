package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaxTest {

    @Test
    void thirdMax() {
        ThirdMax max=new ThirdMax();
        assertEquals(2,max.thirdMax(new int []{1,2}));
        assertEquals(3,max.thirdMax(new int []{1,3}));
        assertEquals(1,max.thirdMax(new int []{1,3,4}));
        assertEquals(1,max.thirdMax(new int []{2, 2, 3, 1}));
        assertEquals(-2147483648,max.thirdMax(new int []{1,2,-2147483648}));

    }
    @Test

    void thirdMax2(){
        ThirdMax max=new ThirdMax();
        assertEquals(1,max.thirdMax2(new int []{2, 2, 3, 1}));
        assertEquals(-2147483648,max.thirdMax2(new int []{1,2,-2147483648}));
    }
}