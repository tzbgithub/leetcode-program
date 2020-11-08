package 阿_模板包.树的模板.遍历树模板.层序遍历_获得树深度;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;


public class Test {
    public static void main(String[] args) {
        TreeDepth depth = new TreeDepth();

        TreeNode root = util.createTree("1,2,3,#,5,#,4");
//		util.printTree(root);

        System.out.println(depth.bfs(root));


    }
}
