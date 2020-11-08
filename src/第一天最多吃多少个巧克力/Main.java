package 第一天最多吃多少个巧克力;
/*
 * test 3 7
 * out 4
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int ChocolateNum = in.nextInt();

        int sum = 1;
        for (int i = 1; i <= n - 2; i++) {
            int k = i * 2;
            sum += k;
        }
        System.out.println(ChocolateNum - sum);


    }

}
