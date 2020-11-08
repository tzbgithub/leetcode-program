package 合并数字成为回文的最少次数;

//https://www.nowcoder.com/question/next?pid=2811407&qid=46573&tid=32651892
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

//		for(int l:list) {
//			System.out.print(l);
//		}

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                if (list.get(left) < list.get(right)) {
                    list.set(left + 1, list.get(left) + list.get(left + 1));
                    list.remove(left);
                } else {
                    list.set(right - 1, list.get(right) + list.get(right - 1));
                    list.remove(right);
                }
                count++;
                right--;
            } else {

                left = left + 1;
                right = right - 1;

            }
        }
        System.out.println(count);
    }

}
