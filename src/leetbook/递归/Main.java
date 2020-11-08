package leetbook.递归;

/**
 * Create by zhatang on 2020/10/3.
 * 反转打印字符串
 */
public class Main {

    public static void printReverse(String s) {
        helper(0, s);
        return;
    }

    private static void helper(int index, String s) {
        if (index >= s.length()) {
            return;
        }
        helper(index + 1, s);
        System.out.println(s.charAt(index));
    }
}


class Test {
    public static void main(String[] args) {
        Main.printReverse("abc");
    }
}