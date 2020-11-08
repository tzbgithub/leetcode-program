package 阿_模板包.树的模板.遍历树模板;

import 阿_模板包.util.*;

import java.util.LinkedList;
import java.util.Queue;

public class BfsWithQueue {
    public void bfs(TreeNode root) {
        if(root == null)
            return ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); //poll弹出队头 【2，3】 弹出 2，如果需要反向遍历，只要将弹出队尾就行
            //在这里处理遍历到的node节点 这里处理当前节点
            if(node.left!=null)
                queue.add(node.left);
                //这里处理 节点的左孩子
            if(node.right!=null)
                queue.add(node.right);
                //这里处理 节点的右孩子
        }
    }
}