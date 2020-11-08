package 阿_模板包.树的模板.遍历树模板.层序遍历_获得树深度;

import 阿_模板包.util.*;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Create by zhatang on 2020/7/4.
 * 用queue队列实现bfs
 * 深度获得 = 添加一个for循环 + 一个维护深度的变量
 */
public class TreeDepth {
    public int bfs(TreeNode node) {
        if(node == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        queue.add(node);
        while (!queue.isEmpty()) {
            depth++; //在下面for循环的操作下，导致 while循环执行次数 = 深度
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode treeNode = queue.poll();
                //在这里处理遍历到的TreeNode节点

                if(treeNode.left!=null)
                    queue.add(treeNode.left);
                if(treeNode.right!=null)
                    queue.add(treeNode.right);
            }
        }
        return depth;
    }
}
