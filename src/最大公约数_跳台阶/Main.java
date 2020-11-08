package 最大公约数_跳台阶;
//https://www.nowcoder.com/question/next?pid=2811407&qid=46575&tid=32664315

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int init = in.nextInt();
        int end = in.nextInt();


        int cur = init;


        int error = 0;

        while (cur != end) {
            int k = maxGongYueShu(cur, end);
//    System.out.println(k);

            //��������
            if (k == Integer.MIN_VALUE) {
                error = -1;
                break;
            } else {

                //cur����
                cur = cur + k;
                //count
                count++;
            }
        }

        if (error == 0) {
            System.out.println(count);
        } else {
            System.out.println(error);
        }
    }


    public static int maxGongYueShu(int num1, int num2) {

        int minNum = num1;

        int maxGongYueShu = Integer.MIN_VALUE;

        for (int i = 2; i < minNum; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                if (i > maxGongYueShu) {
                    maxGongYueShu = i;
                }
            }
        }

        return maxGongYueShu;

    }


}