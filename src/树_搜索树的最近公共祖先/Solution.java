package 树_搜索树的最近公共祖先;

import 阿_模板包.util.TreeNode;

/**
 栈和队列都是为了迭代的时候能够回溯，如果不需要回溯就不需要这样的数据结构
 不需要回溯：一条路走到底，不需要走其他路径（只有一条直线，没有分叉）

 题目要求：root是不为空的，p，q一定是搜索树的两个节点，搜索树的值是唯一的

 最近公共祖先 = 四种情况 = 对于任一节点 （1 都在的左子树 + 2 都在右子树 + 3 左右子树各一个）
                        4 该节点的左右子树都没有p q

 由于搜索树的大小关系，可以根据当前节点的值和p，q节点的值做比较，得到四种情况

 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //root题目设定不空
        int pVal = p.val;
        int qVal = q.val;
        TreeNode cur = root;
        while(cur!=null){
            //都在左子树
            if(pVal>cur.val && qVal>cur.val){
                cur = cur.right;
            }//都在右子树
            else if(pVal<cur.val && qVal<cur.val){
                cur = cur.left;
            }//在左子树有一个，或者右子树有一个
            else{
                return cur;
            }
        }
        //该节点的左右子树都没有p，q
        return null;
    }
}