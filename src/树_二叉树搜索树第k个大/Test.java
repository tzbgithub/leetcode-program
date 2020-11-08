package 树_二叉树搜索树第k个大;

import 阿_模板包.util;

/**
 */



public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
		util.TreeNode root = util.createTree("5,3,6,2,4,#,#,1");

//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        util.printTree();

		System.out.println(solu.kthLargest(root,3));


    }
}
