package 回文_最长的回文_返回字串;

/*https://leetcode-cn.com/problems/longest-palindromic-substring/solution/
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] beginEndIndex = new int[2];

        int maxV = Integer.MIN_VALUE;

        String s = in.next();

        char[] chars = s.toCharArray();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j + i - 1 < s.length(); j++)
                if (isPalindrome(chars, j, j + i - 1)) {
                    if (maxV < i - 1) {
                        maxV = i - 1;
                        beginEndIndex[0] = j;
                        beginEndIndex[1] = j + i;
                    }
                }
        }
        System.out.println(s.substring(beginEndIndex[0], beginEndIndex[1]));


    }

    public static boolean isPalindrome(char[] chars, int start, int end) {
        for (int i = start, j = end; j > i; i++, j--) {
            if (chars[i] != chars[j])
                return false;
        }
        return true;
    }

}
