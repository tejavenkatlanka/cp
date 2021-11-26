package com.git.t.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    int i = 0, j = 0;

    int startMax = 0;
    int endMin = 0;
    List<int[]> list = new ArrayList<>();

    while (i < firstList.length && j < secondList.length) {

      startMax = Math.max(firstList[i][0], secondList[j][0]);
      endMin = Math.min(firstList[i][1], secondList[j][1]);

      if (endMin >= startMax) {
        list.add(new int[]{startMax, endMin});
      }
      if (endMin == firstList[i][1]) {
        i++
        ;
      }

      if (endMin == secondList[j][1]) {
        j++
        ;
      }


    }
   return  list.toArray(new int[0][2]);
  }
}
