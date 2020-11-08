package 阿_模板包.树的模板.路径模板;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("1,2,3,4,5,6,7");
//		util.printTree(root);

        System.out.println(solu.binaryTreePaths(root));


    }
}
