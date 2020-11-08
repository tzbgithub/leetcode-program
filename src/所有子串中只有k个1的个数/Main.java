package 所有子串中只有k个1的个数;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int oneNum = in.nextInt();
        String s = in.next();


        char[] charArr = s.toCharArray();

        if (oneNum > s.length()) {
            System.out.println(0);
        } else {
            int count1 = 0;
            int count2 = 0;


            for (int i = 0; i < charArr.length; i++) {
                for (int j = i; j < charArr.length; j++) {
                    if (charArr[j] == '1') {
                        count1++;
                    }
                    if (count1 == oneNum) {
                        count2++;
                    }

                }
                count1 = 0;
            }

            System.out.println(count2);

        }
    }
}
