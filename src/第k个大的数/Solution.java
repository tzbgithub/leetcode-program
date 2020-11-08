package 第k个大的数;

/**
 * 类似快排思路
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/solution/shu-zu-zhong-de-di-kge-zui-da-yuan-su-by-leetcode-/
 */

import java.util.Random;

public class Solution {
    Random random = new Random();

    public int KthMax(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);

    }

    private int quickSelect(int[] nums, int l, int r, int index) {
        int q = randomPation(nums, l, r);
        if (q == index) {
            return nums[q];
        } else {
            return q > index ? quickSelect(nums, l, q - 1, index) : quickSelect(nums, q + 1, r, index);
        }

    }

    private int randomPation(int[] nums, int l, int r) {
        int i = random.nextInt(r - l + 1) + l; // l ~ r
        swap(nums, i, r);
        return pation(nums, l, r);
    }

    private int pation(int[] nums, int l, int r) {
        int ref = nums[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (nums[j] < ref) {
                swap(nums,++i,j);//l ~ r中有多少个小于 ref值的
            }
        }
        swap(nums, i + 1, r);
        return i + 1; //确定 ref值是这个的第几大
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

class Test {
    public static void main(String[] args)  {
        System.out.println(new Solution().KthMax(new int[]{3,2,1,5,6,4},2));
    }
}

