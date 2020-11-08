package 进制转换_任何进制转换函数;

/**
 * Create by zhatang on 2020/6/23.
 */
public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt("12", 3);
        int n2 = Integer.parseInt("21", 3);
        System.out.println(n1);
        System.out.println(n2);
        int sum = n1 + n2;
        String res  = Integer.toString(sum, 3);
        System.out.println(res);
    }
}
