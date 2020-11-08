package 自然序列_被3整除;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int beginNum = in.nextInt();
            int endNum = in.nextInt();
            System.out.println(generatorAndCount(beginNum, endNum));
        }
    }

    public static int generatorAndCount(int beginNum, int endNum) {
        String ini = "";
        int sum = 0;
        for (int i = 1; i < beginNum; i++) {
            sum = sum + i;//
        }
        int count = 0;
        for (int j = beginNum; j <= endNum; j++) {
            if ((sum = sum + j) % 3 == 0)
                count++;
        }
        return count;
    }
}


//int[] inputArr = new int[len];
//for(int i =0;i<inputArr;i++) {
//	inputArr[i] = in.nextInt();
//}

//System.out.println();