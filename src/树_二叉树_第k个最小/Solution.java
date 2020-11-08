package 树_二叉树_第k个最小;

import 阿_模板包.util.*;

import java.util.Deque;
import java.util.LinkedList;

/**
 https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new LinkedList<>();

        while(true){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if(--k==0){
                return node.val;
            }
            root = node.right;
        }
    }
}