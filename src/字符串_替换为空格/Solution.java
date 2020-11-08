package 字符串_替换为空格;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Create by zhatang on 2020/7/4.
 * 测试用例：we are man
 * 输出结果：we%20are%20man
 */
public class Solution {
    //方法一：检测到空格就替换
    public static String replaceString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            //如果等于空格
            if (charArray[i] == ' ') {
                sb.append("%20");
            }
            //如果不是空格，添加当前字符给sb，循环重新开始
            else
                sb.append(charArray[i]);
        }
        return sb.toString();
    }


    static class Test {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            System.out.println(replaceString(s));

        }
    }
}