package com.git.t.easy.string;

public class LongestUncommonSubSeq {

    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}
