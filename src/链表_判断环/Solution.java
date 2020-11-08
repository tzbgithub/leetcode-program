package 链表_判断环;
import  阿_模板包.util.*;
import  阿_模板包.util;
import 阿_模板包.util;

/**
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        util.ListNode fast;
        ListNode slow = new ListNode(0);
        fast = head;
        slow.next = head;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
