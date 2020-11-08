package 面试算法包.最长不重复字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * 双指针，第一个指针，每次固定字符串的每一个字符，遍历一次
 * 第二个指针，动态向右边扩展，如果set里面没有第二个指针指向的元素，就将这个元素添加到set里面
 *
 */


public class Main {
    public static void main(String[] args) {
        System.out.println(longestNotRepetable("aaaaaa"));
    }

    static int longestNotRepetable(String s) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for (int l = 0; l <n ; l++) {
            for(int r = l;r<n;r++){
                char cur = charArray[r];
                if (!set.contains(cur)) {
                    set.add(cur);
                } else {
                    ans = Math.max(ans,set.size());
                    set.clear();
                    break;
                }
            }
        }
        return ans;
    }
}

