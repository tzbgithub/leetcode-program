package 树_反转树_先序遍历;
import java.awt.List;
import  阿_模板包.util.*;
import  阿_模板包.util;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13");
        util.printTree(root);

        TreeNode reverseRoot = solu.invertTree(root);
        util.printTree(reverseRoot);

    }
}
