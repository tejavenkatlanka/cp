package com.git.t.easy.number;

public class ThirdMax {


    public int thirdMax2(int[] nums) {
        long m1 = Long.MIN_VALUE, m2 = Long.MIN_VALUE, m3 = Long.MIN_VALUE, c = 0;
        for (int n : nums) {
            if (n > m1) {
                m3 = m2;
                m2 = m1;
                m1 = n;
                c++;
            } else if (n > m2 && n < m1) {
                m3 = m2;
                m2 = n;
                c++;
            } else if (n > m3 && n < m2) {
                m3 = n;
                c++;
            }
        }
        if (c >= 3) return (int) m3;
        return (int) m1;

    }

    public int thirdMax(int[] nums) {
        int length = nums.length - 1, j = 0;
        Integer[] max = new Integer[]{null, null, null};
        // we can take long and initialize value to minimum
        for (int i = 0; i <= length; i++) {
            if (max[0] == null || max[0] <= nums[i]) {
                if (max[0] != null && max[0] == nums[i]) continue;
                max[2] = max[1];
                max[1] = max[0];
                max[0] = nums[i];
            } else if (max[1] == null || max[1] <= nums[i]) {
                if (max[1] != null && max[1] == nums[i]) continue;
                max[2] = max[1];
                max[1] = nums[i];
            } else if (max[2] == null || max[2] <= nums[i]) {
                if (max[2] != null && max[2] == nums[i]) continue;
                max[2] = nums[i];
            }
            j++;
        }
        return j > 2 ? max[2] : max[0];
    }
}
