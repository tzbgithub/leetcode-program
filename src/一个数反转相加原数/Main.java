package 一个数反转相加原数;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int initNum = in.nextInt();
        StringBuffer s = new StringBuffer(String.valueOf(initNum));

        int reverseNum = Integer.valueOf(s.reverse().toString());

        System.out.println(reverseNum + initNum);
    }
}



//public static int reverseNum(int initNum) {
//	
//	StringBuffer s = new StringBuffer(String.valueOf(initNum));
//    
//    int reverseNum = Integer.valueOf(s.reverse().toString());
//    
////    System.out.println(reverseNum+initNum);
//    
//    return  reverseNum;
//	
//}