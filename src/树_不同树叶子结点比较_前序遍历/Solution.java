package 树_不同树叶子结点比较_前序遍历;
import java.util.ArrayList;
import java.util.List;

import 阿_模板包.util.TreeNode;
/**
 */
class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List list1 = new ArrayList<Integer>();
        List list2 = new ArrayList<Integer>();

        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        if (root.right == null && root.left == null)
            list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}