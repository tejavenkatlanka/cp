package com.git.t.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RankTest {

    @Test
    void findRelativeRanks() {
        Rank rank= new Rank();
        Assertions.assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, rank.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }
}