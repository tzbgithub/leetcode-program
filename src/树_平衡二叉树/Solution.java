package 树_平衡二叉树;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return isBalanced(root.left)
                && isBalanced(root.right)
                && Math.abs(height(root.left) - height(root.right)) <= 1;
    }

    public int height(TreeNode root) {
        if (root == null)
            return -1;
        return 1 + Math.max(height(root.right), height(root.left));
    }
}