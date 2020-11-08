package 合并k个链表;

import 阿_模板包.util.ListNode;

/**
 * 在会合并两个链表的基础上，扩展的一个归并，就能完成
 */


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        if (left > right) {
            return null;
        }
        int mid = (left + right) >> 1;
        return mergeTwoList(merge(lists, left, mid), merge(lists, mid + 1, right));
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
        cur.next = aCur != null? aCur : bCur;
        return dummy.next;
    }
}

