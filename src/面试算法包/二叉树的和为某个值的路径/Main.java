package 面试算法包.二叉树的和为某个值的路径;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Create by zhatang on 2020/9/29.
 */
public class Main {
    public static void main(String[] args) {
        List<String> path = sumPath(util.createTree("1,2,3,4"));

    }


   public static List<String> sumPath(TreeNode root) {
        Queue<TreeNode> node_queue = new LinkedList<>();
        List<String> path_list = new ArrayList<>();
        node_queue.add(root);
        String path = "" + String.valueOf(root.val);
        while (!node_queue.isEmpty()) {
            TreeNode node = node_queue.poll();
            if (node.left == null && node.right == null) {
                path_list.add(path);
            }
            if (node.left != null) {
                node_queue.add(node.left);
                System.out.println(path + String.valueOf(node.left.val));
            }
            if (node.right != null) {
                node_queue.add(node.right);
                System.out.println(path + String.valueOf(node.right.val));
            }
        }
        return path_list;
    }
}
