package 回文_分割回文字符串;
//https://leetcode-cn.com/problems/palindrome-partitioning/
/*
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        List<List<String>> list = partition(s);

        System.out.println(list.toString());

    }

    public static List<List<String>> partition(String s) {
        return partitionHelper(s, 0);
    }

    private static List<List<String>> partitionHelper(String s, int start) {
        if (start == s.length()) {
            List<String> list = new ArrayList<>();
            List<List<String>> ans = new ArrayList<>();
            ans.add(list);
            return ans;
        }
        List<List<String>> ans = new ArrayList<>();
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s.substring(start, i + 1))) {
                String left = s.substring(start, i + 1);
                for (List<String> l : partitionHelper(s, i + 1)) {
                    l.add(0, left);
                    ans.add(l);
                }
            }

        }

        return ans;

    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
