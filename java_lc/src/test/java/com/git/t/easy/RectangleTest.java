package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void constructRectangle() {
        Rectangle rectangle=new Rectangle();
        assertEquals(new int[]{2,2},rectangle.constructRectangle(4));
    }
}