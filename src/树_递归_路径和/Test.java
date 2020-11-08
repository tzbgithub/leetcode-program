package 树_递归_路径和;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("1,1,13,20");
//		util.printTree(root);
        System.out.println(solu.hasPathSum(root,22));
    }
}
