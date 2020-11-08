package 树_中序遍历_创建斜树;

import java.util.ArrayList;
import java.util.List;

import 阿_模板包.util.TreeNode;


/**
 * https://leetcode-cn.com/problems/increasing-order-search-tree
 */
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return null;
        List<Integer> list = new ArrayList<Integer>();
        dfs(root, list);
        TreeNode newTreeNode = new TreeNode(list.get(0));
        TreeNode temp = newTreeNode;
        for (int i = 1; i < list.size(); i++) {
            newTreeNode.right = new TreeNode(list.get(i));
            newTreeNode = newTreeNode.right;
        }
        return temp;
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }

/**
 * class Solution {
 TreeNode cur;
 public TreeNode increasingBST(TreeNode root) {
 TreeNode ans = new TreeNode(0);
 cur = ans;
 inorder(root);
 return ans.right;
 }

 public void inorder(TreeNode node) {
 if (node == null) return;
 inorder(node.left);
 node.left = null;
 cur.right = node;
 cur = node;
 inorder(node.right);
 }
 }

 https://leetcode-cn.com/problems/increasing-order-search-tree/solution/di-zeng-shun-xu-cha-zhao-shu-by-leetcode/
 *
 */

}