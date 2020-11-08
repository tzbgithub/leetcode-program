package 树_完全二叉树_节点数量;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13,1,2");
//		util.printTree(root);

        System.out.println(solu.countNodes(root));


    }
}
