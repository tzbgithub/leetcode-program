package 阿_模板包.树的模板.创建树模板;

import 阿_模板包.util;
import 阿_模板包.util.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by zhatang on 2020/7/19.
 * 后序和中序创建树
 * 注意生成树的时候，先生成根，然后递归生成右子树，再递归生成左子树（左右子树递归生成不能调转），是后序的方向顺序
 */
class HouXuArrayToTree {
    private int[] inorder;
    private int[] postorder;
    private int postLastIndex;
    private Map<Integer, Integer> map = new HashMap<>(); //如果定义为public class 这条语句会报错

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        postLastIndex = postorder.length - 1;
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
        postLastIndex--;
        int rootIndex = map.get(rootValue);
        TreeNode root = new TreeNode(rootValue);
        root.right = helper(rootIndex + 1, right); //这一条和下一条调换顺序会出错
        root.left = helper(left, rootIndex - 1);
        return root;
    }
}

class Test1 {
    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        util.printTree(new HouXuArrayToTree().buildTree(inorder,postorder)) ;
    }
}


