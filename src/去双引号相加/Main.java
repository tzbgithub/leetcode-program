package 去双引号相加;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s1 = in.next();

        String s2 = in.next();

        s1 = s1.substring(1, s1.length() - 1);

        s2 = s2.substring(1, s2.length() - 1);


        int num1 = Integer.valueOf(s1);

        int num2 = Integer.valueOf(s2);

        int sum = num1 + num2;

        System.out.println("\"" + sum + "\"");
    }

}
