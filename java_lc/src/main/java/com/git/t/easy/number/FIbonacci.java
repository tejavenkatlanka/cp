package com.git.t.easy.number;

public class FIbonacci {
    int[][] init = new int[][]{{1, 1}, {1, 0}};

    public  int fibBymatric(int n){
        if(n<=1)return  n;
        int a[][]=new int[][]{
                {1,1,}, {1,0}};
      matric(a,n-1);
       return a[0][0];
    }

    private void matric(int[][] a, int n) {
        if(n<=1) return;
        matric(a,n/2);
        multiply(a,a);
        if(n%2!=0){
            multiply(a,init);
        }
    }
    private  void multiply(int [][]a,int b[][]){
        int x = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        int y = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        int z = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        int w = a[1][0] * b[0][1] + a[1][1] * b[1][1];

        a[0][0] = x;
        a[0][1] = y;
        a[1][0] = z;
        a[1][1] = w;
    }

    public int fib(int n) {
        if (n < 2)
            return n;
        int a = 0, b = 1;
        int total = 0;
        for (int i = 2; i <= n; i++) {
            total = a + b;
            a = b;
            b = total;
        }
        return total;
    }

}
