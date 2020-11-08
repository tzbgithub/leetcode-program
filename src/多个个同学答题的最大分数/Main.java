package 多个个同学答题的最大分数;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int studentNum = in.nextInt();

        int questionNum = in.nextInt();

        int[][] count = new int[questionNum][5];

        int[] scoreArr = new int[questionNum];


        int sum = 0;

        String[] studentAns = new String[studentNum];
        for (int i = 0; i < studentNum; i++) {
            studentAns[i] = in.next();
        }


        for (int i = 0; i < questionNum; i++) {
            scoreArr[i] = in.nextInt();
        }


        for (int i = 0; i < studentNum; i++) {
            for (int j = 0; j < questionNum; j++) {
                if (studentAns[i].charAt(j) == 'A') {
                    count[j][0]++;
                } else if (studentAns[i].charAt(j) == 'B') {
                    count[j][1]++;
                } else if (studentAns[i].charAt(j) == 'C') {
                    count[j][2]++;
                } else if (studentAns[i].charAt(j) == 'D') {
                    count[j][3]++;
                } else {
                    count[j][4]++;
                }
            }
        }


        for (int line = 0; line < questionNum; line++) {
            Arrays.sort(count[line]);
            int maxK = count[line][4];
            sum += maxK * scoreArr[line];

        }

        System.out.println(sum);

    }

}
