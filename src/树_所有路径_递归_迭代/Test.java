package 树_所有路径_递归_迭代;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root1 = util.createTree("3,2,4");


//		util.printTree(root);

        System.out.println(solu.binaryTreePaths(root1));


    }
}
