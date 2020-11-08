package 树_创建平衡搜索二叉树;

import 阿_模板包.util;

/**
 */



public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
//		TreeNode root = util.createTree("");

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        util.printTree(solu.sortedArrayToBST(arr));

//		System.out.println();


    }
}
