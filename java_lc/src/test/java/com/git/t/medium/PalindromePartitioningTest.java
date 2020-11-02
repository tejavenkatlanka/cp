package com.git.t.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromePartitioningTest {

    @Test
    void partition() {
        PalindromePartitioning req=new PalindromePartitioning();
        assertEquals(List.of(List.of("a","a","b"),List.of("aa","b")),req.partition("aab"));
    }
}