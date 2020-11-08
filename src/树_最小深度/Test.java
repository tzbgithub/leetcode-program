package 树_最小深度;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;


public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("1,2,3,#,5,#,4");
//		util.printTree(root);

        System.out.println(solu.minDepth(root));


    }
}
