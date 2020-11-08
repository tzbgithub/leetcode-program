package 树_锯齿遍历;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13");
//		util.printTree(root);


        java.util.List<java.util.List<Integer>> list = solu.zigzagLevelOrder(root);

    }
}
