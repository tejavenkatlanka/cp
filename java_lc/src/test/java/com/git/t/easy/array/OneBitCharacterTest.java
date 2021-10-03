package com.git.t.easy.array;

import org.junit.jupiter.api.Test;

class OneBitCharacterTest {

  @Test
  void isOneBitCharacter() {
    OneBitCharacter oneBitCharacter = new OneBitCharacter();
    //[1,0,0]
    //[0,0,0]
    assert oneBitCharacter.isOneBitCharacter(new int[]{1, 0, 0});
    assert !oneBitCharacter.isOneBitCharacter(new int[]{1, 1, 1, 0});
  }
}