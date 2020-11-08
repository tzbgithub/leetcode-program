package 链表_插入排序;
import  阿_模板包.util.*;
import  阿_模板包.util;


/**

 */
class Solution {

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode pre = dummy, tail = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val >= tail.val) {
                tail.next = cur;
                tail = cur;
                cur = cur.next;
            }
            else {
                ListNode temp = cur.next;
                tail.next = temp;
                while (pre.next != null && pre.next.val <= cur.val) {
                    pre = pre.next;
                }
                cur.next = pre.next;
                pre.next = cur;
                pre = dummy;
                cur = temp;
            }
        }
        return dummy.next;
    }
}