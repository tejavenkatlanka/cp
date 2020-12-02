package com.git.t.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CommonMatch {

  public String[] findRestaurant(String[] list1, String[] list2) {

    List<String> list = new ArrayList<>();
    Map<String, Integer> stringIntegerMap = new HashMap<>();
    int min = list1.length + list2.length;
    for (int i = 0; i < list1.length; i++) {
      stringIntegerMap.put(list1[i], i);
    }
    for (int i = 0; i < list2.length; i++) {
      if (stringIntegerMap.containsKey(list2[i])) {
        int newIndex = stringIntegerMap.get(list2[i]) + i;
        if (min > newIndex) {
          list = new LinkedList<>();
          list.add(list2[i]);
          min = newIndex;
        } else if (min == newIndex) {
          list.add(list2[i]);

        }
      }
    }
    return list.toArray(new String[0]);
  }
}
