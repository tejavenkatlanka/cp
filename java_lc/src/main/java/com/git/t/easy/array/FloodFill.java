package com.git.t.easy.array;

public class FloodFill {

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (!validIndex(sr, image.length) || !validIndex(sc, image[sr].length)) {
      return image;
    }
    fillHelper(image, sr, sc, newColor, image[sr][sc]);
    return image;
  }

  private void fillHelper(int[][] image, int sr, int sc, int newColor, int currentColor) {
    if (!validIndex(sr, image.length) || !validIndex(sc, image[sr].length)
        || image[sr][sc] != currentColor || currentColor == newColor) {
      return;
    }
    image[sr][sc] = newColor;
    fillHelper(image, sr, sc - 1, newColor, currentColor);
    fillHelper(image, sr, sc + 1, newColor, currentColor);
    fillHelper(image, sr - 1, sc, newColor, currentColor);
    fillHelper(image, sr + 1, sc, newColor, currentColor);


  }

  private boolean validIndex(int index, int overFlow) {
    return index >= 0 && index < overFlow;

  }
}
