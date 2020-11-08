package d;
//https://leetcode-cn.com/problems/valid-parentheses/solution/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(singleKuoHaoVaild(s));

    }

    private static boolean singleKuoHaoVaild(String s) {
        char[] charArr = s.toCharArray();
        int left = 0;
        for (int i = 0; i < charArr.length; i++) {
            if ((charArr[i] == '(') | (charArr[i] == '[') | (charArr[i] == '{')) {
                left++;
            }
            if ((charArr[i] == ')') | (charArr[i] == ']') | (charArr[i] == '}')) {
                left--;
            }
        }
        if (left == 0) {
            return true;
        } else {
            return false;
        }
    }
}
