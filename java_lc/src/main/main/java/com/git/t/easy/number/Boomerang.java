package com.git.t.easy.number;

import java.util.HashMap;
import java.util.Map;

public class Boomerang {

  public int numberOfBoomerangs(int[][] points) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points.length; j++) {
        if (i == j) {
          continue;
        }
        int dis = distince(points[i], points[j]);
        map.put(dis, map.getOrDefault(dis, 0) + 1);
      }
      for (int val : map.values()) {
        count += val * (val - 1);
      }
      map.clear();
    }

    return count;
  }

  private int distince(int a[], int[] b) {
    int dx = a[0] - b[0];
    int dy = a[1] - b[1];
    return dx * dx + dy * dy;
  }
}
