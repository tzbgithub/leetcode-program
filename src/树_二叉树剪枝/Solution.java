package 树_二叉树剪枝;
import  阿_模板包.util.*;
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null)
            return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null)
            root = null;
        return root;
    }
}
