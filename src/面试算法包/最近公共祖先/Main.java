package 面试算法包.最近公共祖先;

import 阿_模板包.util;
import 阿_模板包.util.*;

/**
 * Create by zhatang on 2020/9/29.
 */
public class Main {
    TreeNode closeZhuXian(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null || p == root || q==root) {
            return root;
        }
        TreeNode left = closeZhuXian(root.left, p, q);
        TreeNode right = closeZhuXian(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null && right == null) {
            return left;
        }
        if (left == null && right != null) {
            return right;
        }else {
            return null;
        }
    }
}

class Test {
    public static void main(String[] args) {
        util.printTree(new Main().closeZhuXian(util.createTree("1,2,3"), util.createTree("2"), util.createTree("3")));
    }
}

