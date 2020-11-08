package 判断一个序列是不是等差序列;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);


        if (isDengCha(arr)) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }

    public static boolean isDengCha(int[] arr) {


        int d = arr[1] - arr[0];

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
        }

        return true;
    }

}
