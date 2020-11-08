package 动态规划;

//https://leetcode-cn.com/problems/divisor-game/
public class Solution_aliceWinGame {
    public boolean divisorGame(int N) {


        if (N == 1) {
            return false;
        }


        boolean[] dp = new boolean[N + 1];

        dp[1] = false;
        dp[2] = true;


        for (int i = 3; i < dp.length; i++) {
            for (int j = 1; j < i; j++) {
                if ((i % j == 0) && (dp[i - j] != true)) {
                    dp[i] = true;
                }
            }
        }


        return dp[N];
    }
}