package 阿_模板包.树的模板.遍历树模板;

import 阿_模板包.util.*;

import java.util.Stack;

/**
 * Create by zhatang on 2020/7/4.
 * dfs迭代版本,用栈实现dfs
 */
public class DfsWithStack {

    public void dfs(TreeNode node) {
        if(node==null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();

            //在这里处理遍历到的Treenode

            if(node.left!=null)
                stack.push(node.left);
            if(node.right!=null) {
                stack.push(node.right);
            }
        }
    }
}

/* 这个是一个三步递归套路
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
 */