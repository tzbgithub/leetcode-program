package 目标和_和的种数;
/**
 https://leetcode-cn.com/problems/subarray-sum-equals-k
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int targeSum = 2;
        System.out.println(subarraySum(arr, targeSum));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}

