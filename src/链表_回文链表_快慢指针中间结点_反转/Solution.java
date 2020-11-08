package 链表_回文链表_快慢指针中间结点_反转;
import  阿_模板包.util.*;
import  阿_模板包.util;
/**
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        // midPre.next = null;

        ListNode leftHead = head;
        ListNode rightHead = reverse(slow.next);
        while (rightHead != null) {
            if (leftHead.val != rightHead.val) {
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        return true;
    }

    public ListNode reverse(ListNode node) {
        ListNode cur = node;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}