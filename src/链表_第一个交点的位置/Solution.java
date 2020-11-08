package 链表_第一个交点的位置;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha = headA;
        ListNode hb = headB;
        while (ha != hb) {
            ha = ha == null ? headB : ha.next;
            hb = hb == null ? headA : hb.next;


        }
        return ha;
    }
}


