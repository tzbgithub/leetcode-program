package 平方和平方根;

import java.util.Scanner;

public class Mainsq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n_2 = in.nextInt();

        int n = (int) Math.sqrt(n_2);

        int count = 0;
        int[] arr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                if (i * i + j * j == n_2) {
                    if ((i == j) | (i == 0 | j == 0)) {
                        count++;
                    }
                    if ((i != j) && ((i != 0) && (j != 0))) {
                        count += 2;
                    }
                }
            }

        }

        System.out.println(count * 4);
    }
}
