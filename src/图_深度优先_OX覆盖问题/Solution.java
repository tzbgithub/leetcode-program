package 图_深度优先_OX覆盖问题;
//https://leetcode-cn.com/problems/surrounded-regions/
class Solution {
    int rowNum;
    int colNum;
    public void solve(char[][] board) {
        rowNum = board.length;
        colNum = board[0].length;

        for(int c = 0;c<rowNum;c++){
            dfs(0, c, board);
            dfs(colNum-1, c, board);
        }
        for(int r = 0;r<rowNum;r++){
            dfs(r, 0, board);
            dfs(r, rowNum-1, board);
        }
        //扫描替换
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void dfs(int r, int c, char[][] board) {
//        递归终止条件：越界或者不等于O
        if (r < 0 || r >= rowNum || c < 0 || c >= colNum || board[r][c] != 'O') {
            return;
        }
//        每一层递归要做的东西：进行下一层递归，然后如果是等于O，进行标记替换
        board[r][c] = 'A';
        dfs(r-1,c,board);
        dfs(r+1,c,board);
        dfs(r,c-1,board);
        dfs(r,c+1,board);

    }
}


