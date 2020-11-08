package 树_路径和;

import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
//    **********************************迭代*************************************
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//
//        Queue<TreeNode> node_stack = new LinkedList<>();
//        Queue<String> path_stack = new LinkedList<>();
//
//        List<List<Integer>> res = new LinkedList<>();
//        if(root==null)
//            return res;
//        node_stack.add(root);
//
//        path_stack.add(Integer.toString(root.val));
//
//        while(!node_stack.isEmpty()){
//            TreeNode node = node_stack.poll();
//            String path = path_stack.poll();
//
//            //如果是叶子节点
//            if (node.left == null && node.right == null) {
//                if(isEqualSum(path,sum)){
//                    //转化为数组List，并且添加进res
//                    String[] sArr = path.split(" ");
//                    List<Integer> list = new LinkedList<>();
//                    for (String s : sArr) {
//                        list.add(Integer.valueOf(s));
//                    }
//                    res.add(list);
//                }
//
//            }
//
//            if(node.left!=null) {
//                node_stack.add(node.left);
//                path_stack.add(path + " " + node.left.val);
//        }
//            if(node.right!=null) {
//                node_stack.add(node.right);
//                path_stack.add(path + " " + node.right.val);
//            }
//
//        }
//        return res;
//    }
//
//    public static boolean isEqualSum(String s,int sum) {
//
//            int sumS= 0;
//            String[] sArr = s.split(" ");
//            for(String s1 : sArr){
//                int value = Integer.valueOf(s1);
//                sumS = sumS + value;
//            }
//            if (sumS == sum) {
//                return true;
//            }
//            else
//                return false;
//        }
    //    **********************************递归*************************************
public List<List<Integer>> pathSum(TreeNode root, int sum) {
    if(root == null) return new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    if(root.val == sum && root.left == null && root.right == null){
        List<Integer> arr = new ArrayList<>();
        arr.add(root.val);
        ans.add(arr);
        return ans;
    }
    List<List<Integer>> left = pathSum(root.left,sum - root.val);
    List<List<Integer>> right = pathSum(root.right,sum - root.val);
    for(List<Integer> list : left){
        list.add(0,root.val);
        ans.add(list);
    }
    for(List<Integer> list : right){
        list.add(0,root.val);
        ans.add(list);
    }
    return ans;
}

}

