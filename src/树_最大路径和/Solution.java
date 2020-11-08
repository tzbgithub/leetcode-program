package 树_最大路径和;

import 阿_模板包.util.TreeNode;
/**
 * Create by zhatang on 2020/6/28.
 * 递归套路：
 * 1 递归终止条件
 * 2 确定递归返回值
 * 3 一层递归里面做什么
 */

class Solution {
    private int  maxv = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //确定当前函数的返回值 int 最大路径和，和每一层递归返回值无关（每层递归返回值应该是当前节点的增益）
        maxGain(root);
        return maxv;
    }

    //递归函数的返回值 （当前节点的增益）
    public int maxGain(TreeNode node){
        if(node==null) // 1 递归终止条件
            return 0;

        //3 这一级递归做什么？
        int leftGain = Math.max(maxGain(node.left),0);
        int rightGain = Math.max(maxGain(node.right),0);

        int pathSum = node.val + leftGain +rightGain;
        maxv = Math.max(pathSum,maxv);

        //2 确定返回值
        return node.val + Math.max(leftGain,rightGain);
    }
}