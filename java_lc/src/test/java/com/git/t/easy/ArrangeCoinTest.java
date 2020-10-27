package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrangeCoinTest {

    @Test
    void arrangeCoins() {
        ArrangeCoin coin =new ArrangeCoin();
        assertEquals(2,coin.arrangeCoins(5));
    }
}