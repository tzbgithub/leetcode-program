package 树_堂兄弟节点;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13");
//		util.printTree(root);
        System.out.println(solu.isCousins(root, 2, 13));
    }
}
