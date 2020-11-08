package 树_不同树叶子结点比较_前序遍历;

/**
 * ���룺��������
 * ����������
 */

import java.awt.List;

import 阿_模板包.util;
import 阿_模板包.util.*;

public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root1 = util.createTree("1,2,3,4");
        TreeNode root2 = util.createTree("5,3,2,4");


//		util.printTree();

        System.out.println(solu.leafSimilar(root1, root2));


    }
}
