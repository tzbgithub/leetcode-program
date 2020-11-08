package 树_对称树;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13");
//		util.printTree(root);

        System.out.println(solu.isSymmetric(root));


    }
}
