package 字符串_朴素匹配;

import java.util.Stack;

/**
 * Create by zhatang on 2020/6/23.
 * https://leetcode-cn.com/problems/implement-strstr/comments/
 */

class Solution {

    // ***********************************************************暴力******************************************

    public int strStr1(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

//
//    作者：LeetCode
//    链接：https://leetcode-cn.com/problems/implement-strstr/solution/shi-xian-strstr-by-leetcode/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    // ***********************************************************朴素******************************************
    public int strStr2(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        if(n2==0)
            return 0;
        int j =0;
        int firstIndex = -1;
        boolean flag = false;
        //所有状态
        // 1 母串遍历完，但是没有匹配完 return -1
        // 2 母串未遍历完就已经匹配完成，直接返回不用直接遍历母串
        // 不相等的两种状态
        // a 直接第一个不相等 不需要回溯
        // b 前面有一部分相等，当时未完全匹配后出现不相等，需要回溯到之前存储的开头
        for(int i =0;i<n1;i++){
            //相同 存储下标 j++ i++
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j==0)
                    firstIndex = i;
                j++;
            }else{
                //不同 如果不是原始的的firstIndexi，则回溯 j 重置 firstindex 重置
                if(firstIndex!=-1)
                    i =firstIndex;
                j = 0;
                firstIndex = -1;
            }
            if(j==n2){
                flag = true;
                // 直接返回
                return firstIndex;
            }
        }
        if(!flag)
            return -1;
        return firstIndex;
    }


}