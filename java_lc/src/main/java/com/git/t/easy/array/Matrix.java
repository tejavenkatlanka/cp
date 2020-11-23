package com.git.t.easy.array;

public class Matrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length < r * c) {
            return nums;
        }
        int[][] retu = new int[r][c];
        int cr = 0, cc = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (cc == retu[cr].length) {
                    cr++;
                    cc = 0;
                }
                retu[cr][cc++] = nums[i][j];
            }
        }
        return retu;
    }
}
