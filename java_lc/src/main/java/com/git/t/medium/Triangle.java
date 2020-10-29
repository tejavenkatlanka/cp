package com.git.t.medium;

import java.util.List;

public class Triangle {


    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[] =new int[triangle.size()];
        int n=triangle.size();
        for(int i=0;i <triangle.get(n-1).size();i++){
            dp[i]=triangle.get(n-1).get(i);
        }
        for(int layer=n-2; layer>=0;layer--){
            for(int i=0; i<=layer;i++){
                dp[i]=Math.min(dp[i],dp[i+1])+triangle.get(layer).get(i);
            }
        }
    return dp[0];
    }


    public int minimumTotalComplete(List<List<Integer>> triangle) {
        return minimumTotalHelper(triangle, 0, 0, 0, 0);
    }

    public int minimumTotalHelper(List<List<Integer>> triangle, int i, int e1, int e2, int sum) {
        if (i == triangle.size() - 1) {
            return Math.min(sum + triangle.get(i).get(e1), sum + triangle.get(i).get(e2));
        }
        List<Integer> cur = triangle.get(i);
        return Math.min(minimumTotalHelper(triangle, i + 1, e1, e1 + 1, sum + cur.get(e1)),
                minimumTotalHelper(triangle, i + 1, e2, e2 + 1, sum + cur.get(e2)));
    }


}
