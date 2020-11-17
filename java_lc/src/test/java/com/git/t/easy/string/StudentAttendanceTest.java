package com.git.t.easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentAttendanceTest {

    @Test
    void checkRecord() {
    StudentAttendance  studentAttendance=new StudentAttendance();

    assertTrue(studentAttendance.checkRecord("PPALLP"));
        assertFalse(studentAttendance.checkRecord("PPALLL"));
    }
}