package 乘积_用额外空间存储历史信息_数组遍历两次;
/*
 *
input: [1,2,3,4]
output: [24,12,8,6]
*/

import java.util.Scanner;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int leftChengJi = 1;
        int rightChengJi = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = leftChengJi;
            leftChengJi = leftChengJi * nums[i];
        }
        for (int j = nums.length - 1; j > 0; j--) {
            rightChengJi = rightChengJi * nums[j]; //�ұ߳ɼ�
            res[j - 1] = rightChengJi * res[j - 1];
        }
        return res;

    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] testArr = {};//testcopy
        System.out.println(solu.productExceptSelf(testArr));
    }
}
