package 找工作能力和工作难度;

//https://www.nowcoder.com/ta/2019test
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int workNum = in.nextInt();

        int mateNum = in.nextInt();
        int jobId = -1;


        int[] workLevel = new int[workNum];
        int[] workPay = new int[workNum];
        int[] matePower = new int[mateNum];
        for (int i = 0; i < workNum; i++) {
            workLevel[i] = in.nextInt();
            workPay[i] = in.nextInt();
        }
        for (int i = 0; i < mateNum; i++) {
            matePower[i] = in.nextInt();
        }

        for (int p = 0; p < mateNum; p++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < workNum; j++) {
                if (matePower[p] >= workLevel[j]) {
                    if (workPay[j] > maxValue) {
                        maxValue = workPay[j];
                        jobId = j;
                    }
                }
            }
            System.out.println(workPay[jobId]);
        }
    }
}
