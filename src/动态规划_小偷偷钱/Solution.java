package 动态规划_小偷偷钱;

/**
 * Create by zhatang on 2020/8/9.
 */
public class Solution {
    //动态规划
    // 1 自变量 房间号
    // 2 目标值 金钱总数
    // 3 做选择，并且在这些选择中选择最优的max
    // 4 base case

    public int rob(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        if(nums.length == 1)
            return nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        //base case
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<n;i++){
            //偷当天和不偷当天的选择，并且选择最优的那种
            dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
}
