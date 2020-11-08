package 阿_模板包.树的模板.遍历树模板.层序遍历_存储所有节点值;

import 阿_模板包.util;
import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**一维数组
 * Create by zhatang on 2020/7/8.
 * 第一步：层序遍历，就写层序遍历模板
 * 第二步：节点访问出，将访问节点添加到容器中
 */
public class Solution1 {
    public List<Integer> SequenceTraversalAndSave(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();;
        while (!queue.isEmpty()) {

            int count = queue.size();
             //每层的容器

            for (int i = 0; i < count; i++) { //每层个数控制

                TreeNode node = queue.poll();
                //访问点：添加访问后的附加操作（常用:比如维护一个列表，记录每层的元素）
                list.add(node.val);

                /**
                 * 在这里添加代码
                 */

                //访问结束点
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

        }
        }
        return list;
}
}

class Test1{
    public static void main(String[] args) {
        Solution1 solu = new Solution1();
        TreeNode root = util.createTree("1,2,3,#,5,#,4");
//		util.printTree(root);

        System.out.println(solu.SequenceTraversalAndSave(root));
    }
}