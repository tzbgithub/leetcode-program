package 动态规划_金字塔路径最大;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N + 1][1024];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[][] dp = new int[N + 1][1024];
        dp[1][0] = arr[1][0];
        for (int i = 2; i < N + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                }
                else if (j == i - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
                }
            }
        }
        int res = Integer.MIN_VALUE;
        for (int k : dp[N]) {

            if (k > res) res = k;
        }
        System.out.println(res);
    }

}


