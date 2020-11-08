package 链表_合并链表;
import  阿_模板包.util.*;
import  阿_模板包.util;
/*
https://leetcode-cn.com/problems/merge-two-sorted-lists
 *哑节点的运用，两个头需要比较，删除的时候防止空指针异常
 */
import java.util.Scanner;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preNode = new ListNode(-1);
        ListNode pre = preNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }

        if (l1 == null) pre.next = l2;
        if (l2 == null) pre.next = l1;
        return preNode.next;
    }


}
