package 链表_旋转链表;

import  阿_模板包.util.*;
import  阿_模板包.util;

/**
 */
public class Solution {
    public util.ListNode rotateRight(util.ListNode head, int k) {
        if (k == 0 || head == null)
            return head;
        ListNode temp = new ListNode(0);
        ListNode cur = new ListNode(0);
        ListNode xlist = null;
        cur.next = head;
        temp = head;
        int count = 0;

        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        cur.next = temp;

        for (int i = 1; i < count - (k % count); i++) {
            temp = temp.next;
        }
        xlist = temp.next;
        temp.next = null;
        return xlist;
    }
}