package 删除重复字符串;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (in.hasNext()) {
            String s = in.nextLine();


            char[] arr = s.toCharArray();

            List<Character> list = quChong(arr);

            for (char c : list) {
                System.out.print(c);
            }

            System.out.print("\n");

        }
    }

    public static List<Character> quChong(char[] arr) {
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
