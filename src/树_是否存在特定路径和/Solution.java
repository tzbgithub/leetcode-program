package 树_是否存在特定路径和;

import 阿_模板包.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/path-sum/
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        //1 递归结束条件
        if(root == null)
            return false;
        if (root.left == null && root.right == null)
            return sum == root.val;
        //2 确定返回值，（布尔类型）： 左子树存在 || 右子树存在
        //3 一层递归中做的事情：（判断sum==0） （更新sum值,一直到叶子节点）
        sum -= root.val;
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}