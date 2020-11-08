package 动态规划_爬楼梯;

/**
 * Create by zhatang on 2020/7/31.
 */
class Solution {
    public int climbStairs(int n) {
// ********************************超时*********************
        // if(n==1)
        //     return 1;
        // if(n==2)
        //     return 2;
        // return climbStairs(n-1) + climbStairs(n-2);
        //**********************备忘录解法************************************
        //     int[] memo = new int[n+1];
        //     return help(n,memo);
        // }

        // private int help(int n,int[] memo){
        //     if(n==1)
        //         return 1;
        //     if(n==2)
        //         return 2;

        //     if(memo[n]!=0)
        //         return memo[n];
        //     memo[n] = help(n-1,memo)+help(n-2,memo);
        //     return memo[n];
        // }
        // ****************************动态规划***************************
        // 1 自变量：台阶数
        // 2 目标值：方案数
        // 3 （转移方程）每种状态的选择：跳一级还是跳2级，并且选择最优（求方案数量，没有最优 所以就是简单的dp等式，没有不等式）
        // 4 base case：dp[1] = 1 // dp[2] = 2
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int[] dp  = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
