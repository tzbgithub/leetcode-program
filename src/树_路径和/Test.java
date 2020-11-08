package 树_路径和;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("1,2,3,7,8");
//		util.printTree(root);
        System.out.println(solu.pathSum(root,10));
    }

}
