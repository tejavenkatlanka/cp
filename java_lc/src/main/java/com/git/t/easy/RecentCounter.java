package com.git.t.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class RecentCounter {
  Queue<Integer> q;

  public RecentCounter() {
    q = new LinkedList<>();
  }

  public int ping(int t) {
    q.offer(t);
    while (q.peek() < t - 3000) { q.poll(); }
    return q.size();
  }
}