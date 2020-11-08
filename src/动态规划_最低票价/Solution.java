package 动态规划_最低票价;
import java.util.Scanner;

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int len = days.length, maxDay = days[len - 1], minDay = days[0];
        int[] dp = new int[maxDay + 31];
        for (int d = maxDay, i = len - 1; d >= minDay; d--) {
            if (d == days[i]) {
                dp[d] = Math.min(dp[d + 1] + costs[0], dp[d + 7] + costs[1]);
                dp[d] = Math.min(dp[d], dp[d + 30] + costs[2]);
                i--;
            } else dp[d] = dp[d + 1];
        }
        return dp[minDay];
    }
//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] testArr = {1, 4, 6, 7, 8, 20};//testcopy
        int[] testArr1 = {2, 7, 15};
        System.out.println(solu.mincostTickets(testArr, testArr1));
    }
}
