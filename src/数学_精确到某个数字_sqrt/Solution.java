package 数学_精确到某个数字_sqrt;

import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int mid;
        int ans = -1;

        while (l < r) {
            mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        System.out.println(solu.mySqrt(in.nextInt()));
    }
}
