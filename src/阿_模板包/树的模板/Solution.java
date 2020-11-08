package 阿_模板包.树的模板;

import  阿_模板包.util.*;
import  阿_模板包.util;
import java.util.ArrayList;
import java.util.List;
/*
 *
 */


public class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {

        dfs(root, 0);
        return list;

    }

    public void dfs(TreeNode root, int depth) {

        if (root == null)
        if (depth == list.size())
            list.add(root.val);
        depth++;
        dfs(root.right, depth);
        dfs(root.left, depth);
//
    }
}
