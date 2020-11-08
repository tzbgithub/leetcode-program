package 排序;
/*
 */
import java.util.Scanner;

import javax.naming.PartialResultException;

public class kuaiPai_sort {
    public void kuaipai(int[] nums) {
        //快排
        kuaiPai(nums, 0, nums.length - 1);
    }

    private static void kuaiPai(int[] nums, int left, int right) {
        //递归结束条件
        if (left >= right) {
            return;
        }
        int tempIndex;
        tempIndex = Partation(nums, left, right);
        kuaiPai(nums, left, tempIndex-1);
        kuaiPai(nums, tempIndex+1, right);
    }

    private static int Partation(int[] nums, int left, int right) {
        int reference = nums[left];

        int temp ;
        while (left < right) {
            while (left < right && nums[right] >= reference) {
                right--;
            }
            //交换左右指针的值
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            while (left < right && nums[left] <= reference) {
                left++;
            }
            //交换左右指针的值
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return left;
    }


}

class Test {
    public static void main(String[] args) {
        int[] test = new int[]{1, 5, 3, 2};
        new kuaiPai_sort().kuaipai(test);
        for (int t:test) {
            System.out.println(t);
        }
    }
}