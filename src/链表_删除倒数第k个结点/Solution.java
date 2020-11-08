package 链表_删除倒数第k个结点;
import  阿_模板包.util.*;
import  阿_模板包.util;
/*

https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list

 */

/**

 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode copy = new ListNode(0);
        copy.next = head;

        ListNode quick = copy;
        ListNode cur = copy;

        for (int i = 0; i < n + 1; i++) {
            quick = quick.next;
        }
        while (quick != null) {
            quick = quick.next;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return copy.next;
    }
//***************************************自己第二次写法************************
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        //维护一个父亲节点
//        ListNode father1 = null;
//        ListNode father2 = null;
//        ListNode cur = new ListNode(0);
//        ListNode dummy = cur;
//        cur.next  = head;
//        ListNode fast = cur;
//        //先跑k
//        while(n>0){
//            fast = fast.next;
//            n--;
//        }
//        //同时跑
//        while(fast != null){
//            father1 = cur;
//            cur = cur.next;
//            fast = fast.next;
//        }
//        father1.next = cur.next;
//        return dummy.next;
//    }
//}

}




