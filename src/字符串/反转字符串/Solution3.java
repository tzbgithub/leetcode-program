package 字符串.反转字符串;

class Solution3 {
    //返回最长上升子序列的长度
    public int lengthOfLIS(int[] nums) {
        //1 自变量 i
        //2 长度
        //3 选择的所有可能性，最优化的是最大值，所有要初始化最小的
        //4 base case
        int n = nums.length;
        int[] dp = new int[n];
        int res = 0;
        //初始化
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n ; i++) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] >= nums[j]) {
                    maxValue = Math.max(maxValue, dp[j]);
                }
            }
            dp[i] = maxValue + 1;
            res = Math.max(dp[i], res);
        }
        return res;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Solution3().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
