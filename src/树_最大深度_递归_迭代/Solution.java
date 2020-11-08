package 树_最大深度_递归_迭代;

import 阿_模板包.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  递归和迭代
 递归遍历方式，左右再上
 迭代：层数
 */
class Solution {
    // public int maxDepth(TreeNode root) {
    //     //1 递归结束条件
    //     if(root == null){
    //         return 0;
    //     }
    //     //2 确定返回值（在一层递归中：遍历方式，后序遍历）
    //     //返回值：一层递归中返回当前节点的最大深度

    //     //3 一层递归中做什么：计算最大深度 = max（左边子树最大深度，右边子树最大深度）+1。

    //     // 根据2，3有下面的算式
    //     return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    // }

    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            depth++; //外层while执行的次数 = 树的深度
            for(int i =0;i<n;i++){ //n = 每次每层的个数
                TreeNode node = queue.poll();
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
        }
        return depth;
    }

}