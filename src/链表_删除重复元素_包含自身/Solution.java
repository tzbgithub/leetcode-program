package 链表_删除重复元素_包含自身;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = new ListNode(-128);
        cur.next = head;
        ListNode dummy = cur;
        boolean flag = false;
        ListNode pre = new ListNode(-1);
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
                flag = true;
            }
            else if (flag == false) {
                pre = cur;
                cur = cur.next;
            }
            else {
                cur = cur.next;
                pre.next = cur;
                flag = false;
            }
        }
        if (flag == true)
            pre.next = null;
        return dummy.next;
    }
}