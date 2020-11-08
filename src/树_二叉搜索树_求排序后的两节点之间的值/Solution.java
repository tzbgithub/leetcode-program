package 树_二叉搜索树_求排序后的两节点之间的值;
/*
 https://leetcode-cn.com/problems/range-sum-of-bst/solution/
 */

import 阿_模板包.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 当前节点值和LR比大小如果大于等于L并且小于等于R，就将这个值++
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        if(root ==null){
            return 0;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            //判断是不是大小关系是在pq内的
            if(node.val>=L && node.val<=R)
                res += node.val;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return res;
    }
}