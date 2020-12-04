package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {

  @Test
  void canFinish() {
    CourseSchedule courseSchedule = new CourseSchedule();

    assertTrue(courseSchedule.canFinish(2, new int[][]{{1, 0}}));

  }
}