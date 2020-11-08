package 阿_模板包.树的模板.遍历树模板.递归遍历前中后层序控制原理;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.util.*;

/**
 * Create by zhatang on 2020/7/21.
 * 1 一直遍历左斜分支（类似单链表），遍历同时，将节点压栈
 * 2 直到左斜分支为空，弹出最后一个左节点
 * 3 从底往上，最后一个左节点的左孩子和右孩子为空，到倒数第二个左节点，找第二个左节点的右孩子
 * 4 该右孩子进入步骤 1 中找他的左斜分支，节点遍历并且将这些节点压栈
 * 5 结束循环条件：在判断了root == null的条件下，栈空了
 */
public class ZhongXu {
    public List<Integer> zhongxu(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        while(true){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            TreeNode node = stack.pop();
            res.add(node.val);
            root = node.right;
        }
        return res;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new ZhongXu().zhongxu(util.createTree("5,3,6,2,4")));

    }
}
