package com.git.t.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DetectCapitalTest {
    @Test
    void detectCapitalUse() {
        DetectCapital detectCapital = new DetectCapital();
        Assertions.assertTrue(detectCapital.detectCapitalUse("AQSSA"));
        Assertions.assertTrue(detectCapital.detectCapitalUse("asdfjsjadfjajs"));
        Assertions.assertFalse(detectCapital.detectCapitalUse("asdfjsjadfjajsD"));
        Assertions.assertTrue(detectCapital.detectCapitalUse("Aasdsfsd"));
    }
}