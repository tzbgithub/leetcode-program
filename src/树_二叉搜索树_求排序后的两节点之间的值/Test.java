package 树_二叉搜索树_求排序后的两节点之间的值;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("1,2,3,4,5,6");
//		util.printTree(root);

        solu.rangeSumBST(root,2,4);


    }
}
