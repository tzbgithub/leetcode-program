package 树_是否存在特定路径和;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root1 = util.createTree("3,2,4");


//		util.printTree(root);

        System.out.println(solu.hasPathSum(root1, 4));


    }
}
