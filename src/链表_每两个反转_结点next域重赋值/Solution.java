package 链表_每两个反转_结点next域重赋值;
import  阿_模板包.util.*;
import  阿_模板包.util;
import 阿_模板包.util;

/**
 * }
 */
class Solution {
    public util.ListNode swapPairs(util.ListNode head) {
        util.ListNode cur = new util.ListNode(0);
        cur.next = head;
        util.ListNode temp = cur;
        while (cur.next != null && cur.next.next != null) { //���ñ���ָ�붨�����ָ�붼����Ϊ��
            ListNode start = cur.next;
            ListNode end = cur.next.next;

            cur.next = end;

            start.next = end.next;

            end.next = start;
            cur = start;
        }
        return temp.next;
    }
}