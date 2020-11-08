package 面试算法包.变态跳台阶;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Create by zhatang on 2020/9/27.
 */
public class Main {
    public int Jump(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,1);
        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[n];
    }

}

class Test {
    public static void main(String[] args) {
        System.out.println(new Main().Jump(3));
    }
}
