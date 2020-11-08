package 阿_模板包.树的模板.遍历树模板.递归遍历前中后层序控制原理;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by zhatang on 2020/7/21.
 * 模板中要修改两点：
 *  1 数据结构添加元素方式，添加到头（一直排在最后）
 *  2 栈的先入栈右孩子，再入栈左孩子
 *  3 弹出栈，所以就先弹出左孩子
 */
public class HouXu {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        if(root == null)
            return res;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(0,node.val);
            if(node.left!=null)
                queue.addFirst(node.left);

            if(node.right!=null) {
                queue.addFirst(node.right);
            }
        }
        return res;
    }
}
class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new HouXu().postorderTraversal(util.createTree("1,2,3"));
        System.out.println(list.toString());

    }
}