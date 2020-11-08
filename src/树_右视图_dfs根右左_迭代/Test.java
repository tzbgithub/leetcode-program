package 树_右视图_dfs根右左_迭代;

import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root = util.createTree("1,2,3,#,5,#,4");
//		util.printTree(root);

        java.util.List<Integer> testList = solu.rightSideView(root);

        for (int i : testList) {
            System.out.println(i);
        }

    }
}
