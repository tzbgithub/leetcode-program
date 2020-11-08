package 草稿;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
    public int[] delete(int[] nums) {

        int index = findIndex(nums);
        System.out.println(index  + " = index");
        if (index == -1) {
            return nums;
        }

        int left = index;
        int right = index + 1;


        while (left < 0 || right > nums.length) {

            //分三种情况

            if (nums[left] + nums[right] < 0) {
                left--;
            } else if (nums[left] + nums[right] > 0) {
                right++;
            } else {
                left--;
                right++;
            }
        }

        //添加元素到新数组
        int[] res = add(left, right, nums);
        return res;
    }

    private int[] add(int left, int right, int[] nums) {
        int l = left - 0 + nums.length - right + 2;
        int[] res = new int[l];
        for (int i = 0; i <= left; i++) {
            res[i] = nums[i];
        }

        for (int i = right; i <nums.length ; i++) {
            System.out.println(i-left + " " + i + " " + left);
            res[i-left] = nums[i];
        }
        return res;
    }

    public  int findIndex(int[] arr) {
        int res = -1;
        for (int i = 0;i<arr.length;i++) {
            if(arr[i]> 0  && arr[i+1] <0){
                res = i;
            }
        }
        return res;
    }

}

class Test {
    public static void main(String[] args) {
        int[] remain = new Main().delete(new int[]{1, 2, -2, -3});
        for (int i :remain) {
            System.out.println(i);
        }
    }
}



