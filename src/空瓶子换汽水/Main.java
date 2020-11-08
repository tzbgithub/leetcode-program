package 空瓶子换汽水;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int emptyBottle = in.nextInt();
            if (emptyBottle != 0) {

                int sum = 0;
                while (emptyBottle > 2) {
                    sum += emptyBottle / 3;
                    emptyBottle = emptyBottle / 3 + emptyBottle % 3;
                }
                if (emptyBottle == 2) {
                    sum += 1;
                }
                System.out.println(sum);
            }
        }
    }
}
//    /https://www.nowcoder.com/test/question/fe298c55694f4ed39e256170ff2c205f?pid=1088888&tid=32466469
