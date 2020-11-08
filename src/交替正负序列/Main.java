package 交替正负序列;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(genarateJiaoTi(in.nextInt(), in.nextInt()));


    }


    public static long genarateJiaoTi(int n, int m) {

        int count = m;
        int k = 2;
        long sum = 0;
        for (int i = 1; i <= n; i++) {


            if (count == 0) {
                count = m;
                if (k == 2) {
                    k = 0;
                } else {
                    k = 2;
                }
            }
            sum += (1 - k) * i;
            count = count - 1;
        }

        return sum;
    }

}
