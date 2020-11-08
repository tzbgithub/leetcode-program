package 回文_最长的回文_返回最长回文的长度;

/*
 */
//https://leetcode-cn.com/problems/longest-palindrome/solution/zui-chang-hui-wen-chuan-by-leetcode-solution/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        StringBuffer s1 = new StringBuffer(s);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    s1.deleteCharAt(j);

                    s1.deleteCharAt(i);
                    i--;
                    break;
                }
            }
        }

        if (s1.length() == 0) {
            System.out.println(s.length());
        }
        System.out.println((s.length() - s1.length() + 1));

    }
}
