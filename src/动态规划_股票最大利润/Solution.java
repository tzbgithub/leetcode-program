package 动态规划_股票最大利润;

/**
 * Create by zhatang on 2020/7/31.
 */
class Solution {
    /*
    1 确定自变量：天数
    2 确定目标值dp[]: 利润
    3 转移方程，每一个状态的选择 卖出or不卖？
    4 base case: 第0天，利润 0
    ps ： 最大化，初始为目标值的下界 0 (创建就默认，不需要填充)
    */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        //创建dp表
        int[] dp =  new int[n];
        dp[0] = 0;
        //不同子问题的遍历,每个子问题穷举 + 最优选择
        for(int i = 1;i<n;i++){
            min = prices[i-1] < min ? prices[i-1] : min; //得到以前的price的最小值
            int saleToday = prices[i] - min;
            dp[i] = saleToday > dp[i-1] ? saleToday : dp[i-1];//卖和不卖的选择
        }
        return dp[n-1];
    }
}
