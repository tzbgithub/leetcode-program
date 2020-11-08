package 树_右视图_dfs根右左_迭代;
/**
 * bfs:层序遍历模板 + 判断是不是最后一个，是就存储
 * dfs:根右左，如果深度 == 添加的个数，就说明这个当前节点是右视图的第一个节点，要添加到维护的列表中
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
 */
import  阿_模板包.util.*;


public class Solution {
    // ******************************************************迭代**************************************************************
    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        while (!queue.isEmpty()) {

            int count = queue.size();
            // List<Integer> list = new ArrayList<>(); //每层的容器

            for (int i = 0; i < count; i++) { //每层个数控制

                TreeNode node = queue.poll();
                // //访问点：添加访问后的附加操作（常用:比如维护一个列表，记录每层的元素）
                // list.add(node.val); //这一层元素或者所有元素都能靠这个容器添加
                if(i==count-1)
                    res.add(node.val);
                /**
                 * 在这里添加代码
                 */

                //访问结束点
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

            }
            // res.add(list.get(count-1)); //只要修改list中的下标值，就能获得每层第i个的值

        }
        return res;
    }
    // ******************************************************递归**************************************************************
    // public List<Integer> rightSideView(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();
    //     helper(root,0,res);
    //     return res;
    // }

    // public void helper(TreeNode root,int depth,List<Integer> res){
    //     //1 递归终止条件
    //     if(root==null)
    //         return;
    //     //2 遍历方式 --->右子树---->左子树
    //     //3 返回值为空，但是要对判断是不是第一个元素，如果是就加入到结果res
    //     if(res.size() == depth)
    //         res.add(root.val);
    //     depth++;
    //     helper(root.right,depth,res);
    //     helper(root.left,depth,res);
    // }
}
