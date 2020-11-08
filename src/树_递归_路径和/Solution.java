package 树_递归_路径和;

import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        sum -= root.val;

        //root.right and root.left 像单链表的.next判断是不是还有下一个
        if ((root.left == null) && (root.right == null))
            return (sum == 0);
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}

