package 字符串_全排序;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by zhatang on 2020/7/29.
 */
public class Solution {
    List<String> res = new LinkedList<>();
    char[] c;

    public String[] method(String s) {
        c = s.toCharArray();
        help(0);
        return res.toArray(new String[res.size()]);
    }

    private void help(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length ; i++) {
            if (set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            swap(i, x);
            help(x + 1);
            swap(i, x);
        }
    }

    private void swap(int i, int x) {
        char temp = c[i];
        c[i] = c[x];
        c[x] = temp;
    }
}
class Test{
    public static void main(String[] args) {
        String[] strings = new Solution().method("abc");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
