package 树_平衡二叉树;
import  阿_模板包.util.*;
import  阿_模板包.util;


public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root = util.createTree("1,#,2,4");
//		TreeNode root2 = util.createTree("3,2");


//		util.printTree(root);

        System.out.println(solu.isBalanced(root));


    }
}
