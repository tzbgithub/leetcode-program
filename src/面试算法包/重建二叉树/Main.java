package 面试算法包.重建二叉树;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by zhatang on 2020/9/27.
 * 重点：根据中序的根节点到中序最左边的元素之间的距离，得到左子树的距离
 * 左子树的长度是前序数组中划分递归区间的重要依据
 */
public class Main {
    public TreeNode rebuildTree(int[] pre, int[] in) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<in.length;i++){
            map.put(in[i], i);
        }
        return builder(pre, 0, pre.length-1, 0,map);
    }

    private TreeNode builder(int[] pre, int l, int r,int inL,Map<Integer,Integer> map) {
        if (l > r) {
            return null;
        }
        int rootValue = pre[l];
        TreeNode root = new TreeNode(rootValue);
        int inMid = map.get(rootValue);
        int leftTreeSize = inMid - inL;

        root.left= builder(pre, l+1, l+leftTreeSize, inL, map);
        root.right = builder(pre, l + leftTreeSize + 1, r, inL + leftTreeSize + 1, map);
        return root;
    }
}

class Test {
    public static void main(String[] args) {
        util.printTree(new Main().rebuildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }
}
