package 阿_模板包.子串滑动串口模板;

import java.util.HashSet;
import java.util.Set;

/**最长不重复字符：滑动窗口
 * Create by zhatang on 2020/7/28.
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetc-2/
 * 子串都能用滑动窗口解决
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int rk = -1;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {//i = 容器的左边界
            if (i != 0) {
                //左边弹出（左边边界缩小）（容器的边界：hashset的边界）
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            res = Math.max(res, rk - i + 1);//容器的个数 = 容器右边界 - 容器左边界 + 1 vs 历史容器个数 --> 取得最大的
        }
        return res;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abacd"));
    }
}
