package 链表_删除重复元素;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = new ListNode(-128);
        cur.next = head;
        ListNode temp = cur;
        ListNode nextNode = null;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return temp.next;
    }
}