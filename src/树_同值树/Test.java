package 树_同值树;
import 阿_模板包.util;
public class Test {
    public static void main(String[] args) {
        Solution solu = new Solution();

        util.TreeNode root = util.createTree("1,1,1,1");
//		util.printTree();
        System.out.println(solu.isUnivalTree(root));
    }
}
