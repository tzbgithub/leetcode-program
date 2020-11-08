package 阿_模板包.树的模板.遍历树模板.层序遍历_获取每层的元素;

import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**二维数组存储：一维是深度一维是宽度
 * Create by zhatang on 2020/7/8.
 * 第一步：层序遍历，就写层序遍历模板
 * 第二步：节点访问出，将访问节点添加到容器中
 */
public class GetEveryLevelElement {
    public List<List<Integer>> SequenceTraversalAndSave(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        //返回结果，整个树的存储结果（二维数组），一维是深度，一维是一层的个数
        LinkedList<List<Integer>> res = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int count = queue.size();
            List<Integer> list = new ArrayList<>(); //每层的容器

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
            res.add(list);
        }
        return res;
    }

}
