package 树_二叉搜索树叠加_相反中序遍历;
import java.awt.List;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13");
//		util.printTree(root);

        solu.reverseZhongXu(root);
        util.printTree(root);

    }
}
