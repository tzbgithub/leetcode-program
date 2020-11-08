package 树_每层元素存储_深度优先实现等价层序遍历;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("5,2,13");
//		util.printTree(root);


        java.util.List<java.util.List<Integer>> list = solu.levelOrder(root);


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println(list.get(i).get(j));
            }
        }
    }
}
