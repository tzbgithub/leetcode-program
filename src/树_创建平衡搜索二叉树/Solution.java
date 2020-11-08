package 树_创建平衡搜索二叉树;

import 阿_模板包.util.TreeNode;


/**
 * 需要平衡二叉查找树（查找树：节点小于左子树任意值，节点大于右子树任意值，且该节点的左右子树都是查找树）
 * 输入要求：数组排好序
 * 所以给定一个任一的关于树节点的数组，先进行排序，排序数组后对用从中间节点递归创建二叉树
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        //子问题和输入数组有下标限制
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBST(nums, left, mid-1);
        node.right = sortedArrayToBST(nums, mid+1, right);
        return node;
    }
}