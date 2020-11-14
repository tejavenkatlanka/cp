package com.git.t.easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestUncommonSubSeqTest {

    @Test
    void findLUSlength() {
        LongestUncommonSubSeq subSeq=new LongestUncommonSubSeq();

        assertEquals(-1,subSeq.findLUSlength("aaa","aaa"));
        assertEquals(3,subSeq.findLUSlength("aba","cdc"));

    }
}