package com.git.t.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rank {
    public String[] findRelativeRanksOp(int[] nums) {
        String[] s = new String[nums.length];
        String temp[] = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        int max = nums[0];
        for (int e : nums) {
            max = Math.max(max, e);
        }
        int[] ref = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            ref[nums[i]] = i+1;
        }
        int rank = 0;

        for (int r = max; r >= 0; r--) {
            if (ref[r] > 0) {
                rank++;
                if (rank < 3) {
                    s[ref[r]-1] = temp[rank - 1];
                } else {
                    s[ref[r]-1] = rank + "";
                }
            }
        }
        return s;
    }

    public String[] findRelativeRanks(int[] nums) {
        String[] s = new String[nums.length];
        String temp[] = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[] top = new int[3];
        int[] ranks = nums.clone();
        Arrays.sort(ranks);
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < ranks.length; i++) {
            integerMap.put(ranks[i], ranks.length - i);
        }
        for (int i = 0; i < nums.length; i++) {
            int ran = integerMap.get(nums[i]);
            if (ran < 4) {
                s[i] = temp[ran - 1];
            } else {
                s[i] = ran + "";
            }
        }
        return s;

    }
}
