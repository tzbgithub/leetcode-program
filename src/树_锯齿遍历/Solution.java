package 树_锯齿遍历;
import java.util.ArrayList;
import java.util.List;
import 阿_模板包.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //创建一个res
        List<List<Integer>> res = new ArrayList<>();

        //dfs遍历
        dfs(root,res,0);

        return res;
    }

    public void dfs(TreeNode root,List<List<Integer>> res,  int depth){
        if(root == null){
            return ;
        }

        //当前res的长度和深度是一样的
        if(res.size() == depth){
            res.add(new ArrayList<Integer>());
        }

        //判断层数是不是奇偶的
        if((depth & 1) == 1){
            //奇数是头插法
            res.get(depth).add(0,root.val);
        }else{
            res.get(depth).add(root.val);
        }

        //左边子树和右边子树
        dfs(root.left,res,depth+1);
        dfs(root.right,res,depth+1);

    }
}