package 树_二叉搜索树叠加_相反中序遍历;
import java.util.List;
/*
              5
            /   \
           2     13

             18
            /   \
          20     13

https://leetcode-cn.com/problems/convert-bst-to-greater-tree
 *
 */
import java.util.Scanner;

import  阿_模板包.util.*;
public class Solution {

    public TreeNode convertBST(TreeNode root) {
        reverseZhongXu(root);
        return root;
    }

    int sum = 0;

    public void reverseZhongXu(TreeNode root) {
        if (root == null)
            return;
        reverseZhongXu(root.right);
        sum = sum + root.val;
        root.val = sum;
        reverseZhongXu(root.left);
    }
}
