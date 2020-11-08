package 树_后序遍历_迭代_双栈;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        TreeNode root = util.createTree("1,2,3,4");
//		TreeNode root2 = util.createTree("3,2");


//		util.printTree(root);

        System.out.println(solu.postorderTraversal(root));


    }
}
