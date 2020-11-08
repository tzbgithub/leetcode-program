package 从头跳到尾;
import java.util.Scanner;

class Solution {

    public boolean canJump(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                if (passZero(nums, i))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

    public static boolean passZero(int[] nums, int index) {
        for (int i = index; i >= 0; i--) {
            if (nums[i] > (index - i))
                return true;
        }
        return false;
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] test = {3, 2, 1, 0, 4};
        solu.canJump(test);
    }
}
