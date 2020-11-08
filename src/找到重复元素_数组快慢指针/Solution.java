package 找到重复元素_数组快慢指针;

/**
 * https://leetcode-cn.com/problems/find-the-duplicate-numbe*
 * @author acer
 */

public class Solution {

    public int findDuplicate(int[] nums) {

        int fast = 0, slow = 0;
        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (slow == fast) {
                fast = 0;
                while (nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}