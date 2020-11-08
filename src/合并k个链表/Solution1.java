package 合并k个链表;

import 阿_模板包.util.ListNode;

/**
 * 两两合并，只要会两个链表合并，然后扩展一个for循环
 */
public class Solution1 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (int i = 0; i < lists.length; i++) {
            res = mergeTwoList(res, lists[i]);
        }
        return res;
    }

    private ListNode mergeTwoList(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode aCur = a;
        ListNode bCur = b;
        while (aCur != null && bCur != null) {
            if (aCur.val < bCur.val) {
                cur.next = aCur;
                aCur = aCur.next;
            } else {
                cur.next = bCur;
                bCur = bCur.next;
            }
            cur = cur.next;
        }
        cur.next = (aCur != null ? aCur : bCur);
        return dummy.next;
    }
}

