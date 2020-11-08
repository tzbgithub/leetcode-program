package 树_构建树;
import  阿_模板包.util.*;
import  阿_模板包.util;
import java.util.HashMap;
import java.util.Map;


/**
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (preorder == null || n == 0)
            return null;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return constructTree(preorder, 0, n - 1, inorder, 0, n - 1, map);

    }

    public TreeNode constructTree(int[] preorder, int start1, int end1, int[] inorder, int start2, int end2, Map<Integer, Integer> map) {
        if (start1 > end1)
            return null;
        int rootVal = preorder[start1];
        TreeNode root = new TreeNode(rootVal);
        if (start1 == end1)
            return root;
        else {
            int rootIndex = map.get(rootVal);
            root.left = constructTree(preorder, start1 + 1, start1 + (rootIndex - start2), inorder, start2, rootIndex - 1, map);
            root.right = constructTree(preorder, end1 - (end2 - 1 - rootIndex), end1, inorder, rootIndex + 1, end2, map);
            return root;
        }
    }
}