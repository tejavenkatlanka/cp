package com.git.t.medium;

public class BoardGame {

    public static final char O = 'O';
    public static final char X = 'X';

    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return;
        if (board.length < 2 || board[0].length < 2)
            return;
        int i = 0, j = 0, m = board.length, n = board[0].length;

        for (i = 0; i < m; i++) {
            if (board[i][0] == O)
                dfsTravel(board, i, 0);
            if (board[i][n - 1] == O)
                dfsTravel(board, i, n - 1);
        }
        for (j = 0; j < n; j++) {
            if (board[0][j] == O)
                dfsTravel(board, 0, j);
            if (board[m - 1][j] == O)
                dfsTravel(board, m - 1, j);

        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (board[i][j] == O) {
                    board[i][j] = X;
                } else if (board[i][j] == '*') {
                    board[i][j] = O;
                }
            }

        }
    }

    private void dfsTravel(char[][] board, int i, int j) {
        if ((i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != O)) {
            return;
        }
        board[i][j] = '*';
        dfsTravel(board, i - 1, j);
        dfsTravel(board, i + 1, j);
        dfsTravel(board, i, j - 1);
        dfsTravel(board, i, j + 1);
    }
}
