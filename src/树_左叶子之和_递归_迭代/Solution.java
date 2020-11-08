package 树_左叶子之和_递归_迭代;

import 阿_模板包.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/sum-of-left-leaves/solution/
 */
class Solution {
    //    ****************************递归**********************

    public int sumOfLeftLeaves(TreeNode root) {
        int res =0;
        //1 递归终止条件 空
        if (root == null) {
            return 0;
        }
        //2 每一层做什么 判断左叶子 求和
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res = root.left.val;
        }
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);

        //3 每一层递归的返回值 左子树的左叶子节点的和 + 右子树左叶子节点的和 + res
        return left + right + res;
    }

//    ****************************迭代**********************
//    public int sumOfLeftLeaves(TreeNode root) {
//        if(root==null)
//            return 0;
//        //层序遍历模板
//        Queue<TreeNode> node_queue = new LinkedList<>();
//        int res = 0;
//
//        node_queue.add(root);
//        while (!node_queue.isEmpty()) {
//            int n = node_queue.size();
//
//            TreeNode node = node_queue.poll();
//
//            if (node.left != null) {
//                node_queue.add(node.left);
//                //
//                if (node.left.left == null && node.left.right==null) {
//
//                    res += node.left.val;
//                }
//            }
//            if (node.right != null) {
//                node_queue.add(node.right);
//            }
//        }
//        return res;
//    }
}