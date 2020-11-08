package 链表_环形链表_判断环的入口;

import 阿_模板包.util.*;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow;
        slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {


            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}