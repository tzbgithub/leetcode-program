package 字符串_唯一一个字符串;

import javax.xml.transform.SourceLocator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(charArray[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
    }
}