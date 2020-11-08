package 最少袋子装苹果;

//https://www.nowcoder.com/question/next?pid=2811407&qid=46572&tid=32672262
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int appleNum = in.nextInt();
        int flag = 0;

        int curCount = appleNum / 8;
        if ((appleNum % 8 == 4) | (appleNum % 8 == 6)) {
            curCount++;
        } else if (appleNum % 8 == 0) {
        } else {
            flag = -1;
        }

        if (flag == -1) {
            System.out.println(-1);
        } else {
            System.out.println(curCount);
        }

    }

}
