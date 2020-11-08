package 数组_双指针_接雨水;

/**
 * Create by zhatang on 2020/7/29.
 */
public class Solution {
    public int trap(int[] height) {
        //暴力：每个当前元素，向两边扩散
        int n = height.length;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int left_max = 0;
            int right_max = 0;
            for (int j = i; j >= 0; j--) {
                left_max = Math.max(height[j], left_max);
            }

            for (int j = i; j <= n - 1; j++) {
                right_max = Math.max(height[j], right_max);
            }

            ans += Math.min(left_max, right_max) - height[i];
        }
        return ans;
    }
}
