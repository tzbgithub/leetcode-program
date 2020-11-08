package 回文_子串;
/*
 * leetcode:https://leetcode-cn.com/problems/palindromic-substrings/solution/647java-bao-li-dpzhong-xin-kuo-zhan-xiang-jie-by-u/
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String s = in.next();

        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 2; i <= s.length(); i++) {
            for (int j = 0; j + i - 1 < s.length(); j++)
                if (isPalindrome(chars, j, j + i - 1))
                    result++;
        }
        System.out.println(result + s.length());


    }

    public static boolean isPalindrome(char[] chars, int start, int end) {
        for (int i = start, j = end; j > i; i++, j--) {
            if (chars[i] != chars[j])
                return false;
        }
        return true;
    }

}
