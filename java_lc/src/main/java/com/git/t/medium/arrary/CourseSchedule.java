package com.git.t.medium.arrary;

import java.util.ArrayList;

public class CourseSchedule {

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    ArrayList<Integer>[] node = new ArrayList[numCourses];
    int[] degree = new int[numCourses];
    ArrayList<Integer> bfs = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
      node[i] = new ArrayList<>();
    }
    for (int[] course : prerequisites
    ) {
      node[course[1]].add(course[0]);
      degree[course[0]]++;
    }
    for (int i = 0; i < numCourses; i++) {
      if (degree[i] == 0) {
        bfs.add(i);
      }
    }
    for (int i = 0; i < bfs.size(); ++i) {
      for (int j : node[bfs.get(i)]) {
        if (--degree[j] == 0) {
          bfs.add(j);
        }
      }
    }
    return bfs.size() == numCourses;
  }

}
