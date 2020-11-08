package 去重和排序;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {


            int numOfDig = in.nextInt();
            int[] arr = new int[numOfDig];
            for (int i = 0; i < numOfDig; i++) {
                arr[i] = in.nextInt();
            }


            Arrays.sort(arr);


            List<Integer> list = quChong(arr);


            for (int i : list) {
                System.out.println(i);
            }
        }
    }

    public static List<Integer> quChong(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    //	https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-xiang-by-/

}
