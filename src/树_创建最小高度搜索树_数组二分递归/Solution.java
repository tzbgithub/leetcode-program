package 树_创建最小高度搜索树_数组二分递归;
import  阿_模板包.util.*;
import  阿_模板包.util;


/**
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n;
        if (nums == null || (n = nums.length) == 0)
            return null;
        return sortedHelper(nums, 0, n - 1);
    }

    public TreeNode sortedHelper(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int rootIndex = (start + end) / 2;
        TreeNode root = new TreeNode(nums[rootIndex]);
        if (start == end)
            return root;
        root.left = sortedHelper(nums, start, rootIndex - 1);
        root.right = sortedHelper(nums, rootIndex + 1, end);
        return root;
    }
}