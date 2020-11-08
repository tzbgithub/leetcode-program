package 树_构建最大根树;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n;
        if ((n = nums.length) == 0)
            return null;
        return construct(nums, 0, n);
    }


    public TreeNode construct(int[] nums, int beginIndex, int endIndex) {
        if (beginIndex == endIndex)
            return null;

        int maxindex = maxIndexMethod(nums, beginIndex, endIndex);
        TreeNode root = new TreeNode(nums[maxindex]);
        root.left = construct(nums, beginIndex, maxindex);
        root.right = construct(nums, maxindex + 1, endIndex);
        return root;
    }

    public int maxIndexMethod(int[] nums, int beginIndex, int endIndex) {

        int maxI = beginIndex;
        for (int i = beginIndex; i < endIndex; i++) {
            if (nums[i] > nums[maxI]) {
                maxI = i;
            }
        }
        return maxI;
    }
}