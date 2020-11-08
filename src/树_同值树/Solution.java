package 树_同值树;

import 阿_模板包.util;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isUnivalTree(util.TreeNode root) {

        boolean left_yes = root.left == null || root.val == root.left.val && isUnivalTree(root.left);

        boolean right_yes = root.right == null || root.val == root.right.val && isUnivalTree(root.right);

        return left_yes && right_yes;
    }
}