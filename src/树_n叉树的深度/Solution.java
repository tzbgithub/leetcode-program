package 树_n叉树的深度;

import 阿_模板包.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> queue = new LinkedList<>();

        if(root == null)
            return 0;
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int n = queue.size();
            for(int i =0;i<n;i++){
                Node node = queue.poll();
                for(Node child :node.children){ //类似二叉树中迭代 对每个孩子节点进行添加到队列中
                    if(child!=null)
                        queue.add(child);
                }
            }
        }
        return depth;
    }
}