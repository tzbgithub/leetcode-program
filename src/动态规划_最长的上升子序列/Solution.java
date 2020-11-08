package 动态规划_最长的上升子序列;
import java.util.Scanner;

public class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        if (n == 0) return 0;
        int max = Integer.MIN_VALUE;
        int[] dp = new int[n];

        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            int maxPreValue = 0;
            for (int j = 0; j < i; j++) {
                //找到符合上升的dp[j]，然后dp[j]++
                if (nums[i] > nums[j]) maxPreValue = Math.max(maxPreValue, dp[j]);

            }
            dp[i] = maxPreValue + 1;
            max = Math.max(dp[i], max);
        }
        return max;
    }


    public static void main(String[] args) {
        Solution solu = new Solution();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solu.lengthOfLIS(nums));
    }
}
