package com.git.t.easy.array;

public class PlaceFlower {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    for (int i = 0; i < flowerbed.length && count < n; i++) {
      if (flowerbed[i] == 0 && (i - 1 < 0 ? 0 : flowerbed[i - 1]) == 0
          && (i + 1 >= flowerbed.length ? 0 : flowerbed[i + 1]) == 0) {
        count++;
        flowerbed[i] = 1;
      }
    }
    return count >= n;
  }
}
