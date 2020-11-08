package 树_每层元素存储_深度优先实现等价层序遍历;
import  阿_模板包.util.*;
import  阿_模板包.util;
import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;


public class Solution {

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return list;
        dfs(root, 0);
        return list;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null)
            return;
        if (depth == list.size())
            list.add(new ArrayList<Integer>());
        list.get(depth).add(root.val);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}