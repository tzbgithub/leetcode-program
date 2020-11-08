package 面试算法包.树的路径和;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by zhatang on 2020/10/1.
 */
public class Main {

    List<List<Integer>> res = new ArrayList<>();

    List<List<Integer>> sumPath(TreeNode root, int sum) {
        List<Integer> path = new ArrayList<>();
        backtrace(root, sum, path);
        return res;
    }

    private void backtrace(TreeNode root, int sum, List<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        sum -= root.val;
        if (sum == 0 &&root.left == null && root.right == null) {
            res.add(new ArrayList<>(path)); //添加一个内容是path，但是对象不是和path指向同一对象的（因为后面path还要删除掉一个元素，所以不能指向path）
        }
        backtrace(root.left, sum, path);
        backtrace(root.right, sum, path);
        path.remove(path.size() - 1);
    }
}

class Test {
    public static void main(String[] args) {
        List<List<Integer>> list = new Main().sumPath(util.createTree("1,4,4"), 5);
        for (List<Integer> l:list
             ) {
            System.out.println(l.toString());
        }
    }
}