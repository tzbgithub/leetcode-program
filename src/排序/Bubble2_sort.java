package 排序;

/*
 */
import java.util.Scanner;

public class Bubble2_sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Bubble_sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    public static void Bubble_sort(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 2; j >= i; j--) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
