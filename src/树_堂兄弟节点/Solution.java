package 树_堂兄弟节点;

import 阿_模板包.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 思路：维护状态变量（第一次或者第二次时候会执行什么），通常是一个计数器变量
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            int n = queue.size();
            int firstmeet = -1;
            for(int i =0;i<n;i++){
                int isChild = 0;
                TreeNode node = queue.poll();
                if(x == node.val || y == node.val){
                    count++;
                }
                if(node.left!=null){
                    queue.add(node.left);
                    if(x == node.left.val || y == node.left.val)
                        isChild++;
                }
                if(node.right!=null){
                    queue.add(node.right);
                    if(x == node.right.val || y == node.right.val)
                        isChild++;
                }
                if(isChild==2){
                    return false;
                }
            }
            if(count == 1){
                return false;
            }
            else if(count == 2){
                return true;
            }
        }
        return false;
    }
}