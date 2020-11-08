package 树_二叉搜索树_判断;
import 阿_模板包.util;

import java.awt.List;


public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        util.TreeNode root = util.createTree("5,2,13");
//		util.printTree(root);

        System.out.println(solu.isValidBST(root));


    }
}
