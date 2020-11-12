package com.git.t.easy;

import com.git.t.easy.number.Boomerang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoomerangTest {

    @Test
    void numberOfBoomerangs() {
        Boomerang boomerang = new Boomerang();
        assertEquals(2, boomerang.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}}));
    }
}