package 树_层序遍历_之字路径_奇正偶反;

import 阿_模板包.util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 * 层序遍历模板 + 深度奇偶判断
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> node_queue = new LinkedList<>();
        int depth = 1;
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)
            return res;

        node_queue.add(root);
        while(!node_queue.isEmpty()){
            int n = node_queue.size();//每一层的个数
            depth++;
            //奇 正序 偶数 反序
            List<Integer> list = new LinkedList<>();
            for(int i =0;i<n;i++){
                TreeNode node = node_queue.poll();
                if((depth&1)==0){
                    list.add(node.val);
                }
                else{
                    list.add(0,node.val);
                }

                if(node.left !=null){
                    node_queue.add(node.left);
                }
                if(node.right!=null){
                    node_queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}