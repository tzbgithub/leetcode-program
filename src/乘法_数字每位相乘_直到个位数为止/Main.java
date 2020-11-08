package 乘法_数字每位相乘_直到个位数为止;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String num = in.next();
        int count = 0;
        long sum = 1;
        boolean flag = true;

        while (flag == true) {
            for (int i = 0; i < num.length(); i++) {
                String s1 = num.substring(i, i + 1);
//			System.out.println(s1);
                long oneNum = Integer.valueOf(s1);

                sum = sum * oneNum;
//			System.out.println(sum);

            }
            if (sum < 10) {
                flag = false;
            } else {
                num = String.valueOf(sum);
                sum = 1;
            }
            count++;

        }
        System.out.println(count);
    }
}
