package 二分法_查找重复左边的第一个元素;

import java.util.Scanner;

class Solution {
    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                right = mid - 1;
            }
        }
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] testArr = {1, 2, 2, 3, 3, 5};//testcopy
        int target = in.nextInt();
        System.out.println(solu.left_bound(testArr, target));
    }
}
