package 树_判断是不是子树;

import  阿_模板包.util.*;
import  阿_模板包.util;

import java.awt.List;


public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root1 = util.createTree("1,#,2,4");
        TreeNode root2 = util.createTree("3,2");


//		util.printTree(root);

        System.out.println(solu.isSubtree(root1, root2));


    }
}
