package 动态规划_换零钱;

import java.util.Arrays;
/*
 * ��leetcode�ĵ���ģ��
 *
 */
import java.util.Scanner;

public class Cashier {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount+1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coin) {
                    dp[j] = dp[j] + dp[j - coin];
                }
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int[] coins = {10, 20, 50};
        Cashier solu = new Cashier();
        System.out.println(solu.change(amount, coins));
    }
}
    
    
