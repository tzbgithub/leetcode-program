package 树_创建树_前序和中序;

import 阿_模板包.util;

/**
 */



public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
//		TreeNode root = util.createTree("");

        int[] arr = {3, 9, 20, 15, 7};
        int[] arr2 = {9, 3, 15, 20, 7};
        util.printTree(solu.buildTree(arr, arr2));

//		System.out.println();


    }
}
