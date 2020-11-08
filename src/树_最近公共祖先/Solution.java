package 树_最近公共祖先;
//https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/solution/236-er-cha-shu-de-zui-jin-gong-gong-zu-xian-hou-xu/

import 阿_模板包.util.*;

/**
 * 后序遍历：从底层往上
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //1 递归结束条件（p == root 或者q == root递归结束，或者就是一直找找到root == null了都没找到）
        // 节点为空，返回null
        if(root == null)
            return null;
        //p，q是不是root，
        if( root == p|| root == q)
            return root;
        //2 每一层递归的返回值 如果有公共祖先，就是返回这个值，如果没有就返回null
        //3 每一层递归做什么 判断是那种情况的返回值
        //如果p不为空，
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        //一个在点在左边子树，一个在右边子树
        if (left != null && right != null) {
            return root;
        }
            //左子树有pq，所以pq都在左边的子树
        if (left != null && right == null) {
            return left;
        }
            //右子树有pq
        if (left == null && right != null) {
            return right;
        }
        //左右子树都没有
        return null;
    }
}
