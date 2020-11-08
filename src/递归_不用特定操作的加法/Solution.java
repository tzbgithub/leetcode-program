package 递归_不用特定操作的加法;

import java.util.Scanner;

class Solution {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }


    //test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        System.out.println(solu.sumNums(-6));
    }
}
