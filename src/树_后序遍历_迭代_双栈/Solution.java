package 树_后序遍历_迭代_双栈;

import 阿_模板包.util.TreeNode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        //迭代需要栈来保存遍历的节点，因为return的是List类型，所以不用栈来实现，用linkedList存储
        LinkedList<Integer> output = new LinkedList<>();
        if(root==null) return output;
        LinkedList<TreeNode> stack = new LinkedList<>();

        //栈进行初始化，加入root节点
        stack.add(root);

        //树遍历结束的节点
        while (!stack.isEmpty()) {
            //顶出来
            TreeNode node = stack.pollLast();
            //顶出来的加入到output 的头部
            output.addFirst(node.val);
            //如果node有左右节点，入栈
            if (node.left!=null) {
                stack.add(node.left);
            }
            if (node.right!=null) {
                stack.add(node.right);
            }
        }
        return output;
    }
}