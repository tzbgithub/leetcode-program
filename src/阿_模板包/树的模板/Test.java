package 阿_模板包.树的模板;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();
        TreeNode root = util.createTree("1,2,3,#,5,#,4");
//		util.printTree(root);

        System.out.println(solu.rightSideView(root));


    }
}
