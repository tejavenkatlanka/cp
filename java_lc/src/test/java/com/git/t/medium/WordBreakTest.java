package com.git.t.medium;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WordBreakTest {

    @Test
    void wordBreak() {
        WordBreak brea = new WordBreak();
        assertTrue(brea.wordBreak("leetcode", Set.of("leet", "code")));
    }
}