package 判断是不是连续子串;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(isSubString(s1, s2));
    }

    private static boolean isSubString(String bigS, String smallS) {
        if (bigS.indexOf(smallS) == -1) {
            return false;
        }
        return true;
    }
}
