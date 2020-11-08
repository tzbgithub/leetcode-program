package 树_反转树_先序遍历;
import java.util.List;

/**
 *
 */
import java.util.Scanner;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        xianXu(root);
        return root;
    }

    TreeNode temp;

    public void xianXu(TreeNode root) {
        if (root == null)
            return;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        xianXu(root.left);
        xianXu(root.right);
    }
}