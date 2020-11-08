package 动态规划_最大子序和;

/**
 * Create by zhatang on 2020/7/31.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        //改问题具有最优子结构：可以用动态规划来做
        // 1 自变量: i当前数组的下标
        // 2 目标值：以第i个元素结尾的（前面都是连续的）连续子序列的最大和
        // 3 选择，每个状态的选择，并且选择最优（最大）
        // 4 base case：dp[0] = 0
        // 5 最后的返回值所有dp里面选择最大的那个返回（对dp表进行一次取最大操作，返回最大值）
        //ps:初始为0
        int n = nums.length;
        int res =nums[0];
        int[] dp = new int[n];// 0 - n-1
        //base case
        dp[0] = nums[0];


        for(int i = 1;i<n;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            res = Math.max(dp[i],res);
        }
        return res;
    }
}