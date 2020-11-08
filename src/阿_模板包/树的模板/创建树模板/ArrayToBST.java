package 阿_模板包.树的模板.创建树模板;

import 阿_模板包.util.*;

/**
 * Create by zhatang on 2020/7/8.
 * 创建二叉搜索树模板（前提：输入数组是有序的）
 */
public class ArrayToBST {
    public TreeNode arraytoBST(int[] nums){
        return arraytoBST(nums, 0, nums.length - 1);//转化为和子问题一致的原问题递归函数式入口
    }

    private TreeNode arraytoBST(int[] nums, int left, int right) {
        if (left > right) { //递归结束条件：当子问题的数组范围一个元素也没有的时候，递归函数出口
            return null;
        }

        /**
         * 这里进行其他创建树的附加操作
         */

        int mid = left + (right - left) / 2; //不要用（left+right）/2，这样会溢出
        TreeNode node = new TreeNode(nums[mid]);
        node.left = arraytoBST(nums, left, mid-1);
        node.right = arraytoBST(nums, mid+1, right);
        return node;
    }



}
