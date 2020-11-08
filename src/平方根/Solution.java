package 平方根;
//https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode-solution/
class Solution {
    public int Mysqrt1(int x) {
        int res = (int) Math.exp(0.5*Math.log(x));
        return (res + 1) * (res + 1) >= x ? res : res + 1;
    }

    public int Mysqrt2(int x) {
        int left = 0;
        int right = x;
        int res = 0;
        while (left<=right) {
            int mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Solution().Mysqrt1(8));
        System.out.println(new Solution().Mysqrt2(8));
    }
}