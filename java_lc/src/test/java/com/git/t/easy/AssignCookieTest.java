package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssignCookieTest {

    @Test
    void findContentChildren() {
        AssignCookie cookie=new AssignCookie();

        assertEquals(1,cookie.findContentChildren(new int[]{1,2,3},new int[]{1,1}));
    }
}