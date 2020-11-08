package 排序;
import java.util.Scanner;

public class chaRu_sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        chaRu_sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    public static void chaRu_sort(int[] arr) {

        int temp;
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] <= temp) break;
                    arr[j + 1] = arr[j];
                    k = j;

                    arr[k] = temp;
                }
            }
        }
    }
}
