package com.git.t.medium.arrary;

public class FindMin {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int lo = 0, hi = nums.length - 1;
        if (nums[hi] > nums[0]) {
            return nums[0];
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[mid - 1] > nums[mid]) return nums[mid];

            if (nums[0] < nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
