package 字符串最大公共前缀;

//https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-chang-gong-gong-qian-zhui-by-leetcode/
class Solution {
    public String longestCommonPrefix(String[] strs) {


        if (strs.length == 0) {
            return "";
        }
        String preFix = strs[0];


        for (String s : strs) {
            while (s.indexOf(preFix) != 0) {
                preFix = preFix.substring(0, preFix.length() - 1);
            }
            if (preFix == "") {
                return "";
            }

        }
        return preFix;
    }
}