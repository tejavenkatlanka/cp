package com.git.t.easy.string;

public class StudentAttendance {
    public boolean checkRecord(String s) {
        return s.indexOf('A') == s.lastIndexOf('A') && !s.contains("LLL");
    }
}
