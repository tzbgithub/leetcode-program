package 树_二叉树搜索树第k个大;

import 阿_模板包.util.TreeNode;

import javax.sound.midi.MidiChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * 思路：
 *      1 搜索树反中序遍历（右子树--》根--》左子树）：倒序排列
 *      2 排序完后，取第k个
 * 优化：不用完全排序完，直接取第k个(k作为倒计数器)(k和res都是类变量)
 */
class Solution {

    //    public int kthLargest(TreeNode root, int k) {
//        List<Integer> list = new ArrayList<>();
//        mid(root,list);
//        return list.get(k-1);
//    }
//
//    public void mid(TreeNode root, List<Integer> list){
//        if(root ==null){
//            return ;
//        }
//        mid(root.right,list);
//        list.add(root.val);
//        mid(root.left,list);
//    }
//
//    *****************************优化****************************************
    private int k;
    private int res;
    public int kthLargest(TreeNode root, int k) {
        this.k = k; //每次调用函数：就会重置类变量k
        mid(root);
        return res;
    }

    private void mid(TreeNode root) {
        if (root == null) {
            return;
        }

        mid(root.right);
        if(k==0)
            return;
        if (--k == 0) {
            res = root.val;
        }
        mid(root.left);
    }
}