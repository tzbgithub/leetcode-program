package 链表_双指针_删除;
import  阿_模板包.util.*;
import  阿_模板包.util;
/**
 * while(cur1!=null) {//for(i)
 * cur2 = cur1.next; //for(j,j=i+1)
 * while(cur2!=null){
 * }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null) {
            ListNode cur = pre.next; //  j = i+1
            while (cur.next != null) {
                if (pre.next.val == cur.next.val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            pre = pre.next;
        }
        return dummy.next;

    }
}