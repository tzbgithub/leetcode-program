package 阿_模板包.树的模板.创建树模板;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by zhatang on 2020/7/19.
 * 注意生成树的时候，先生成根，然后递归生成左子树，再递归生成右子树（左右子树递归生成不能调转），是前序的顺序
 */

class QianXuArrayToTree {
    private int[] inorder;
    private int[] postorder;
    private int postLastIndex;
    private Map<Integer, Integer> map = new HashMap<>(); //如果定义为public class 这条语句会报错

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        postLastIndex = 0;
        //初始化中序map存储结构
        int index = 0;
        for (int i :
                inorder) {
            map.put(i, index++);
        }
        return helper(0,inorder.length-1);

    }

    private TreeNode helper(int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = postorder[postLastIndex];
        System.out.println(rootValue);
        postLastIndex++;
        int rootIndex = map.get(rootValue);
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(left, rootIndex - 1); ////这一条和下一条调换顺序会出错
        root.right = helper(rootIndex + 1, right);
        return root;
    }
}

class Test {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        util.printTree(new QianXuArrayToTree().buildTree(inorder,preorder)) ;
    }
}