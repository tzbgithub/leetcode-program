package 重排序是否满足相邻为4的倍数;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count4 = 0;
        int listSize = 0;
        for (int j = 0; j < count; j++) {
            listSize = in.nextInt();
            count1 = 0;
            count2 = 0;
            count4 = 0;
            for (int i = 0; i < listSize; i++) {
                int num = in.nextInt();

                if (num % 4 == 0) {
                    count4++;
                } else if (num % 2 == 0) {
                    count2++;
                } else {
                    count1++;
                }
            }
            if (count4 >= count1 || count4 >= count1 - 1 && (count1 + count4) == listSize) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}