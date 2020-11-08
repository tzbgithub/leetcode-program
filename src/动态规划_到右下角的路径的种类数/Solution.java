package 动态规划_到右下角的路径的种类数;
import java.util.Arrays;
/*������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������

���ܹ��ж�������ͬ��·����



���磬��ͼ��һ��7 x 3 �������ж��ٿ��ܵ�·����

?

ʾ��?1:

����: m = 3, n = 2
���: 3
����:
�����Ͻǿ�ʼ���ܹ��� 3 ��·�����Ե������½ǡ�
1. ���� -> ���� -> ����
2. ���� -> ���� -> ����
3. ���� -> ���� -> ����


��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/unique-paths
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 *
 */
import java.util.Scanner;

public class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        dp[0][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int g = solu.uniquePaths(a, b);
        System.out.println(g);
    }
}
