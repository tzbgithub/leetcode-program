package 最小唯一前缀;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stringNum = in.nextInt();

        String[] stringArr = new String[stringNum];

        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < stringNum; i++) {
            stringArr[i] = in.next();
        }


        for (int i = 0; i < stringNum; i++) {
            for (int j = i + 1; j < stringNum; i++) {
                for (int k = 0; k < stringArr[i].length(); k++) {
                    if (stringArr[i].charAt(k) != stringArr[j].charAt(k)) {
                        if (k > maxIndex) {
                            maxIndex = k;
                        }
                    }
                }
            }
            System.out.println(stringArr[i].substring(0, maxIndex + 2));
        }

    }
}