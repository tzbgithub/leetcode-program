package 最大公约数_跳台阶;

import java.util.Scanner;

public class SelfYueShu {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;

//		 System.out.println(maxSelfYueShu(n));

        for (int i = 1; i <= n; i++) {
            sum += maxSelfYueShu(i);
        }
        System.out.println(sum);
    }


    public static int maxSelfYueShu(int num1) {



//		if(num1 == 1) {
//			return 1;
//		}
//		if(num1==2) {
//			return 2;
//		}
//		
        int maxSelfYueShu = Integer.MIN_VALUE;

        for (int i = 1; i <= num1; i++) {
            if ((num1 % i == 0)) {
                if ((i > maxSelfYueShu) && (i % 2 == 1)) {
                    maxSelfYueShu = i;
                }
            }
        }

        return maxSelfYueShu;

    }

}
