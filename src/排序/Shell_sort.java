package 排序;
/*
 */
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Shell_sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }


        shellSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void shellSort(int[] arr) {

        int temp;
        int increment = arr.length;
        int k = 0;
        do {
            increment = increment / 3 + 1;

            for (int i = increment; i < arr.length; i++)
                if (arr[i] < arr[i - increment]) {
                    temp = arr[i];
                    for (int j = i - increment; j >= 0 && temp < arr[j]; j -= increment) {
                        arr[j + increment] = arr[j];
                        k = j;
                    }
                    arr[k] = temp;
                }
        } while (increment > 1);
    }
}
