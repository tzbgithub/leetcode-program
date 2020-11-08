package 字符串_转整型数字;

/*
 * https://leetcode-cn.com/problems/string-to-integer-atoi/solution/
 *
 */
import java.util.Scanner;

class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() <= 0) return 0;
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
        int res = 0, index = 0;
        while (index < str.length() && str.charAt(index) == ' ') index++;
        if (index == str.length()) return 0;
        char firstChar = str.charAt(index);
        boolean positive = true;
        if (!Character.isDigit(firstChar)) {
            if (firstChar != '+' && firstChar != '-') return 0;
            index++;
            positive = firstChar != '-';
        }
        int limit = positive ? -MAX : MIN;
        while (index < str.length() && str.charAt(index) == '0') index++;
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index++) - '0';
            if (res < (limit + digit) / 10) {
                return positive ? MAX : MIN;
            }
            res = res * 10 - digit;
        }
        return positive ? -res : res;
    }


    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);

        System.out.println(solu.myAtoi(in.next()));
    }
}
