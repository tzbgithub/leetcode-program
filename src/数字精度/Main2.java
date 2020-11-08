package 数字精度;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            float len = s.length();
            int count = 1;
            for (int i = 0; i < len - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    count++;
                }
            }

            String a = String.format("%.2f", len / count);
            System.out.println(a);
        }
    }
}