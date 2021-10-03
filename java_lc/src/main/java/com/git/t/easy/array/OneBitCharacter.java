package com.git.t.easy.array;

public class OneBitCharacter {

  public boolean isOneBitCharacter(int[] bits) {
    int onesCounter = 0;

    for (int i = bits.length - 2; i >= 0 && bits[i] != 0; i--) {
      onesCounter++;
    }
    return onesCounter % 2 <= 0;

  }
}
