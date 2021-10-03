package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.easy.array.AssignCookie;
import org.junit.jupiter.api.Test;

class AssignCookieTest {

  @Test
  void findContentChildren() {
    AssignCookie cookie = new AssignCookie();

    assertEquals(1, cookie.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
  }
}