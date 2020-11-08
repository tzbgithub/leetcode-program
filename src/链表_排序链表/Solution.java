package 链表_排序链表;
import  阿_模板包.util.*;
import  阿_模板包.util;
/**
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        ListNode res = new ListNode(0);
        ListNode dummy = res;
        while (left != null && right != null) {
            if (left.val > right.val) {
                res.next = right;
                right = right.next;
            } else {
                res.next = left;
                left = left.next;
            }
            res = res.next;
        }
        res.next = left == null ? right : left;
        return dummy.next;
    }
}