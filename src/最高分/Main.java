package 最高分;

//https://www.nowcoder.com/test/question/3897c2bcc87943ed98d8e0b9e18c4666?pid=260145&tid=32474332

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        while (in.hasNextInt()) {
            int numOfStudents = in.nextInt();

            int numOfSql = in.nextInt();



            int[] studentGorce = new int[numOfStudents];

            for (int i = 0; i < numOfStudents; i++) {
                studentGorce[i] = in.nextInt();
            }

            for (int j = 0; j < numOfSql; j++) {

                if (in.next().equals("Q")) {
//        		 System.out.println("test for q");
                    int beginIndex = in.nextInt();
                    int endIndex = in.nextInt();

                    if (beginIndex > endIndex) {
                        int temp = beginIndex;
                        beginIndex = endIndex;
                        endIndex = temp;
                    }

                    int biggestScore = 0;
                    for (int cur = beginIndex - 1; cur < endIndex; cur++) {
                        if (studentGorce[cur] > biggestScore) {
                            biggestScore = studentGorce[cur];
                        }
                    }
                    System.out.println(biggestScore);


                } else {
                    int index = in.nextInt();
                    int updataData = in.nextInt();

                    studentGorce[index - 1] = updataData;

                }
            }
        }
    }
}