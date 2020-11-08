package 树_完全二叉树_节点数量;

import 阿_模板包.util.TreeNode;

/**https://leetcode-cn.com/problems/count-complete-tree-nodes/
 * 通过左子树深度和右子树深度来判断：
 * 如果相等，说明左右子树的叶子节点都在同一层，就是左子树是满二叉树 （满二叉树的节点和深度的计算公式 2^n-1）
 * 否则
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right); //左子树满二叉树节点计算 2^n-1 + 根节点 1 = 2^n + 右边节点数
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    private int height(TreeNode root) {
        int depth = 0;
        while (root != null) {
            depth++;
            root = root.left;
        }
        return depth;
    }
}
