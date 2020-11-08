package 字符串_最长公共前缀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

/**
 * Create by zhatang on 2020/7/4.
 *  输入: ["flower","flow","flight"]
 *  输出: "fl"
 */

//
public class Solution {
    public static  String zuiChangGongGongQianZhui(String[] strArr) {
//        if(!checkStr()){
//            return "";
//        }
        int n = strArr.length;
        StringBuilder res = new StringBuilder();
        //1 对字符串数组排序
        Arrays.sort(strArr);
        //2 第一个和最后一个比较
        int m1 = strArr[0].length();
        int m2 = strArr[n-1].length();
        int m = m1 > m2 ? m2 : m1;
        for (int i = 0; i < m; i++) {
            if (strArr[0].charAt(i) == strArr[n - 1].charAt(i)) {
                res.append(strArr[0].charAt(i));
            } else {
                break;
            }
        }
        return res.toString();
    }

//    private boolean checkStr(Stirng[] strs) {
//        boolean flag = false;
//        if (strs != null) {
//            for (int i = 0; i < strs.length;i++) {
//
//            }
//        }
//
//    }
    public static void main(String[] args) throws IOException {
        String[] sArr = {"ower","flow","flight"};
        System.out.println(zuiChangGongGongQianZhui(sArr));
    }
}
