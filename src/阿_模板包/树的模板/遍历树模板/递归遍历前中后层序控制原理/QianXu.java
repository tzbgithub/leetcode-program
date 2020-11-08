package 阿_模板包.树的模板.遍历树模板.递归遍历前中后层序控制原理;

import 阿_模板包.util;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by zhatang on 2020/7/21.
 * 递归能使得前序关键，添加到队列或者栈的顺序：
 *  1 先添加该节点的右孩子，然后再到左孩子
 *  2 每次添加的位置，是到队列或者栈的头
 *  3 因为左孩子是最后入队列或栈头的，所以每次先弹出处理
 */
public class QianXu {
    public List<Integer> preorderTraversal(util.TreeNode root) {
        List<Integer> res = new LinkedList<>();

        if(root == null)
            return res;
        Deque<util.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            util.TreeNode node = queue.poll();
            res.add(node.val);
            if(node.right!=null)
                queue.addFirst(node.right);
            //因为最后入栈，所以下一次弹出的node就是左节点
            if(node.left!=null) {
                queue.addFirst(node.left);
            }
        }
        return res;
    }
}

class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new QianXu().preorderTraversal(util.createTree("1,2,3,4,5"));
        System.out.println(list.toString());

    }
}
