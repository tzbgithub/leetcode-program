package 树_坡度_左右子树的结点差;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    int sum = 0;

    public int findTilt(TreeNode root) {
        if (root == null)
            return 0;
        houXu(root);
        return sum;
    }

    public int houXu(TreeNode root) {
        if (root == null)
            return 0;
        int left = houXu(root.left);
        int right = houXu(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }
}