package 链表_反转特定范围;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode dummy = cur;
        ListNode startPre = null;
        ListNode start = null;
        ListNode end = null;
        for (int i = 0; i < m; i++) {
            cur = cur.next;
            if (i == m - 2)
                startPre = cur;
        }
        start = cur;

        for (int j = m; j < n; j++) {
            cur = cur.next;
        }
        end = cur;
        ListNode temp = end.next;
        end.next = null;
        ListNode revlist = reverseList(start);
        if (startPre != null) {
            startPre.next = revlist;
            start.next = temp;
        } else {

            start.next = temp;
            return revlist;
        }
        return dummy.next;
    }

    private ListNode reverseList(ListNode start) {
        ListNode cur = start;
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