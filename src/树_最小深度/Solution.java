package 树_最小深度;
import 阿_模板包.util.*;
/**
 * Create by zhatang on 2020/6/28.
 */
/**
 思路：
 左子树的最小深度和右子树的最小深度取得最小 +1
 递归结束条件（返回值3中情况）：
 1-如果为空，返回0
 2-左右子树都空的，返回1
 3-
 如果左边子树不是空的，最小深度和递归返回结果比较
 如果右边子树不是空的，最下深度和递归返回结果比较

 返回因为根节点，所以最小深度还要+1
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left ==null&&root.right == null)
            return 1;
        int min_depth = Integer.MAX_VALUE;
        if(root.left!=null)
            min_depth = Math.min(minDepth(root.left),min_depth);
        if(root.right!=null)
            min_depth = Math.min(minDepth(root.right),min_depth);
        return min_depth+1;
    }
}
