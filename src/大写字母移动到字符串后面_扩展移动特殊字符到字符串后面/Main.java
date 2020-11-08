package 大写字母移动到字符串后面_扩展移动特殊字符到字符串后面;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(getResult(str));
        }
    }

    public static String getResult(String str) {


        return str.replaceAll("[A-Z]", "") + str.replaceAll("[a-z]", "");
    }

}