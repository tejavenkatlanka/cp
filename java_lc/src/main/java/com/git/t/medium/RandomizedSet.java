package com.git.t.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomizedSet {

  java.util.Random rand = new java.util.Random();
  private HashMap<Integer, Integer> valueIndexRel;
  private List<Integer> indexes;

  public RandomizedSet() {
    valueIndexRel = new HashMap<>();
    indexes = new ArrayList<>();
  }

  public boolean insert(int val) {
    boolean contain = valueIndexRel.containsKey(val);
    if (contain) {
      return false;
    }
    valueIndexRel.put(val, indexes.size());
    indexes.add(val);
    return true;
  }

  public boolean remove(int val) {
    boolean contain = valueIndexRel.containsKey(val);
    if (!contain) {
      return false;
    }
    int loc = valueIndexRel.get(val);
    if (loc < indexes.size() - 1) {
      int lastOne = indexes.get(indexes.size() - 1);
      indexes.set(loc, lastOne);
      valueIndexRel.put(lastOne, loc);

    }
    valueIndexRel.remove(val);
    indexes.remove(indexes.size() - 1);
    return true;

  }

  public int getRandom() {
    return indexes.get(rand.nextInt(indexes.size()));
  }
}
