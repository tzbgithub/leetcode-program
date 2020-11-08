package 树_对称树;
import  阿_模板包.util.*;
import  阿_模板包.util;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isreverEqual(root.left, root.right);
    }

    public boolean isreverEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;
        return isreverEqual(t1.left, t2.right) && isreverEqual(t1.right, t2.left);
    }
}
