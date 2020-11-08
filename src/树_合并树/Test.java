package 树_合并树;


import java.awt.List;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root1 = util.createTree("1,#,2,4");
        TreeNode root2 = util.createTree("3,2");


        util.printTree(solu.mergeTrees(root1, root2));

//		System.out.println();


    }
}
