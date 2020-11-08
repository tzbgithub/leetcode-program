package 十六进制转为10进制;


import java.util.Scanner;

public class Main {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String hex_num = in.nextLine();

            hex_num = hex_num.substring(2);


//        System.out.println(hex_num);

            long dec_num = Long.parseLong(hex_num, 16);
            System.out.println(dec_num);
        }
    }
}