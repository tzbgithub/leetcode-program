package 链表_树_链表转平衡二叉树;
import  阿_模板包.util.*;
import  阿_模板包.util;
/**
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {

        if (head == null)
            return null;
        else if (head.next == null) { //��·��
            return new TreeNode(head.val);
        }
        ListNode pre = head;
        ListNode slow = pre.next;
        ListNode fast = slow.next;


        while (fast != null && fast.next != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}