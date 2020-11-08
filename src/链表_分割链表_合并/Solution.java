package 链表_分割链表_合并;
import  阿_模板包.util.*;
import  阿_模板包.util;
import com.sun.scenario.effect.Merge;


import java.util.List;


/**
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;
        ListNode cur = head;
        ListNode left = new ListNode(0);
        ListNode leftcur = left;


        ListNode right = new ListNode(0);
        ListNode rightcur = right;


        int count = 1;

        while (cur != null) {
            if (count == x) {

                ListNode node;
                if (right.next != null)
                    node = InsertToRight(right, cur.val);
                else {
                    node = InsertToRight(right, cur.val);
                    rightcur = node;
                }
            } else if (cur.val < x) {
                leftcur.next = new ListNode(cur.val);
                leftcur = leftcur.next;
            } else {
                rightcur.next = new ListNode(cur.val);
                rightcur = rightcur.next;
            }
            cur = cur.next;
            count++;
        }


        leftcur.next = right.next;
        return left.next;

    }

    public ListNode InsertToRight(ListNode right, int x) {
        ListNode node = new ListNode(x);
        node.next = right.next;
        right.next = node;
        return node;
    }
}