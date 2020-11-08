package 阿_模板包.动态规划模板;

/**
 * Create by zhatang on 2020/7/30.
 */


public class One {
//*********************************************方法1：带有重复的递归（画出递归树就知道）****************************************
//    public int filbolaqi(int n) {
//        if (n == 1 || n==2) {
//            return 1;
//        }
//        return filbolaqi(n - 1)+filbolaqi(n-2);
//    }
//    *****************************************方法2:备忘录，存着以前某个递归函数的历史结果（自顶向下）*****************************************
//    public int filbolaqi(int n) {
//        if (n < 1) {
//            return 0;
//        }
//        int[] memo = new int[n + 1]; //创建数组作为备忘录，存储求解第一次后同一子问题结果
//        return helper(n, memo);
//    }
//
//    private int helper(int n, int[] memo) {
//        //base case
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        //如果备忘录（历史记录不是空的）
//        if(memo[n]!=0) {
//            return memo[n];
//        }
//        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
//        return memo[n];
//    }

    //    *****************************************方法3:将备忘录从递归中独立出来，叫做动态规划表，自底向上*****************************************
    public int filbolaqi(int n) {
        int[] dp = new int[n+1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new One().filbolaqi(8));
    }
}
