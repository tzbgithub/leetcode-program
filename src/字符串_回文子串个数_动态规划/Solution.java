package 字符串_回文子串个数_动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 https://leetcode-cn.com/problems/palindromic-substrings/solution/hui-wen-zi-chuan-by-leetcode/
 */
class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.equals("")){
            return 0;
        }

        int n = s.length();
        int count = n;
        //初始状态
        boolean[][] dp = new boolean[n][n];
        for(int i = 0;i<n;i++){
            // 自身必定为回文
            dp[i][i] = true;
        }
        for(int i = n-1;i>=0;i--){
            for(int j =i+1;j<n;j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j ==i+1){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                else{dp[i][j] = false;}

                if(dp[i][j] ==true){
                    count++;
                }
            }
        }
        return count;
    }


    static class Test {
        public static void main(String[] args) throws IOException {
            System.out.println("请输入测试字符串");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            System.out.println(new Solution().countSubstrings(s));
        }
    }
}