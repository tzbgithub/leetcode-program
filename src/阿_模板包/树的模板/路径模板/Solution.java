package 阿_模板包.树的模板.路径模板;

import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *有些题目是需要对路径进行某些条件限制，通用的模板：bfs （存储所有到叶节点路径）+ 路径过滤
 */


/**
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        // ********************************************迭代*******************************************

             // 队列的遍历树的bfs模板

             //为了转化为路径模板，需要添加以下容器
                 //1 记录一条路径的容器，字符串或者列表
                 //2 记录路径变化的队列
                 //3 所有到叶子节点的路径容器

             //添加一个操作
                 //判断叶节点（添加路径的时机）
             Queue<TreeNode> node_stack = new LinkedList<>();
             Queue<String> path_stack = new LinkedList<>();
             List<String> res = new ArrayList<>();
             if(root==null)
                 return res;

             node_stack.add(root);
             path_stack.add(Integer.toString(root.val));

             while(!node_stack.isEmpty()){
                 TreeNode node = node_stack.poll();
                 System.out.println("node:"+node.val);
                 String path = path_stack.poll();

                 if(node.left == null && node.right == null){
                     res.add(path);
                 }

                 if(node.left!=null){
                     node_stack.add(node.left);
                     System.out.println("node.left:" + node.left.val);
                     path_stack.add(path+"->"+Integer.toString(node.left.val));
                 }
                 if(node.right!=null){
                     node_stack.add(node.right);
                     System.out.println("node.right:"+node.right.val);
                     path_stack.add(path+"->"+Integer.toString(node.right.val));
                 }
             }
             return res;
         }

        // ********************************************递归*******************************************

        //因为需要额外添加容器，所以本身的函数要转化为带有添加容器的递归函数
//        List<String> paths = new ArrayList<>();
//        if(root==null){
//            return paths;
//        }
//
//        helper(root,"",paths);
//        return paths;
//    }

//    public void helper(TreeNode node, String path, List<String> pathList){ //全局维护的容器，不需要返回值
//        //1 递归结束条件
//        if(node == null){
//            return ;
//        }
//
//        // 因为路径的先后是根先，所以先序
//        path = path +Integer.toString(node.val);
//        //2 每层递归做什么 判断是不是叶子节点 添加路径列表 单条路径更新
//        if(node.left==null && node.right==null)
//            pathList.add(path);
//        //不是叶子节点继续
//        path += "->";
//        helper(node.left,path,pathList);
//        helper(node.right,path,pathList);
//    }

}
