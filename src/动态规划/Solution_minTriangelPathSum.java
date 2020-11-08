package 动态规划;
//https://leetcode-cn.com/problems/triangle/solution/javadong-tai-gui-hua-si-lu-yi-ji-dai-ma-shi-xian-b/

import java.util.List;

public class Solution_minTriangelPathSum {
    public int minimumTotal(List<List<Integer>> triangle) {

        int row = triangle.size();
        int col = triangle.get(row - 1).size();

        int res = Integer.MAX_VALUE;
        int[][] dp = new int[row][col];

        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }
            }
        }

        for (int i = 0; i < col; i++) {
            res = Math.min(res, dp[row - 1][i]);
        }
        return res;
    }
}
