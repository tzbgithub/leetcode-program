package 树_中序遍历;
/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/
 * 思路：因为原函数表达式返回的是一个列表，所以原函数的问题和子函数的问题返回的对象不一样，所以无法使用原函数进行子问题的递归，
 * 需要重现创建一个返回对象和子问题对象返回类型一样的函数，就是helper函数
 */

import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.List;


class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root!=null){
            helper(root,list);
        }
        return list;
    }
    //中序遍历
    public void helper(TreeNode root,List<Integer> list){
        if(root==null)
            return ;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}


