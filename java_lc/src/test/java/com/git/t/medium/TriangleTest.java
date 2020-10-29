package com.git.t.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void minimumTotal() {
        Triangle triangle = new Triangle();

        assertEquals(11, triangle.minimumTotal(List.of(List.of(2),
                List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))));

    }
}