package com.git.t.easy.array;

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0 || s.length==0) return 0;

        int count=0;
        int gi=0,si=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (gi<g.length&&si<s.length){
            if(g[gi]<=s[si]){
                count++;
                gi++;
            }
            si++;
        }
        return  count;
    }
}
