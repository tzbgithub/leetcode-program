package 链表_链表分割_创建链表分割;
import  阿_模板包.util.*;
import  阿_模板包.util;

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;
        ListNode shaoBin1 = new ListNode(0);
        ListNode shaoBin1temp = shaoBin1;
        ListNode shaoBin2 = new ListNode(0);
        ListNode shaoBin2temp = shaoBin2;

        while (head != null) {
            if (head.val < x) {
                shaoBin1.next = head;
                shaoBin1 = shaoBin1.next;
            }
            if (head.val >= x) {
                shaoBin2.next = head;
                shaoBin2 = shaoBin2.next;
            }
            head = head.next;
        }
        shaoBin2.next = null;
        shaoBin1.next = shaoBin2temp.next;
        return shaoBin1temp.next;
    }
}