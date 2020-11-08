package 树_左叶子之和_递归_迭代;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;


public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root = util.createTree("0,2,4,1,#,3,-1,5,1,#,6,#,8");
//		TreeNode root2 = util.createTree("3,2");


//		util.printTree(root);

        System.out.println(solu.sumOfLeftLeaves(root));


    }
}
