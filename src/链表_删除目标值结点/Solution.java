package 链表_删除目标值结点;
import  阿_模板包.util.*;
import  阿_模板包.util;

/**
 https://leetcode-cn.com/problems/remove-linked-list-elements/solution/yi-chu-lian-biao-yuan-su-by-leetcode/

 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode shaoBin = new ListNode(0);
        shaoBin.next = head;
        ListNode cur = head;
        ListNode pre = shaoBin;
        while (cur != null) {
            if (cur.val == val)
                pre.next = cur.next;
            else
                pre = cur;
            cur = cur.next;
        }
        return shaoBin.next;
    }
}