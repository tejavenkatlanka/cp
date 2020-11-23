package com.git.t.medium.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class BSTIteratorTest {

    @Test
    void next() {

        BSTIterator iterator=new BSTIterator(null);
        assertFalse(iterator.hasNext());
    }
}