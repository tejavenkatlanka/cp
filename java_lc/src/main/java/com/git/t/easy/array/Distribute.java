package com.git.t.easy.array;

import java.util.HashSet;

public class Distribute {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }

    public int distributeCandies1(int[] candyType) {
        boolean[] s = new boolean[200001];

        int num = 0;
        int mid = candyType.length/2;
        for(int c: candyType) {
            int v = c+100000;
            if(!s[v]) {
                s[v]=true;
                num++;
            }
            if(num == mid) return mid;
        }
        return num;
    }

}
