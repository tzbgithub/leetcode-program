package 树_搜索树的最近公共祖先;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root1 = util.createTree("3,2,4");
        TreeNode root2 = util.createTree("2");
        TreeNode root3 = util.createTree("4");


//		util.printTree(root);

        System.out.println(solu.lowestCommonAncestor(root1, root2,root3));


    }
}
