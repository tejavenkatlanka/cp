package com.git.t.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VersionMatchTest {

    @Test
    void compareVersion1() {
        VersionMatch versionMatch =new VersionMatch();
        assertEquals(0, versionMatch.compareVersion1( "1.01", "1.001"));

    }
}