package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmallestLetterGreaterTest {

  @Test
  void nextGreatestLetter() {
    SmallestLetterGreater smallestLetterGreater = new SmallestLetterGreater();
    char actual = smallestLetterGreater.nextGreatestLetter(new char[]{'a', 'b'}, 'z');
    assertEquals('a', actual);
    assertEquals('c', smallestLetterGreater.nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    assertEquals('f', smallestLetterGreater.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));

  }
}