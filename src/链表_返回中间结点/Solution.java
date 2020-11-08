package 链表_返回中间结点;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        first.next = head;
        second.next = head;
        int count = 0;

        while (first.next != null) {
            count++;
            first = first.next;
        }
//           System.out.print(count);

        for (int i = 0; i <= count / 2; i++) {
            second = second.next;
        }
        return second;
    }

    /**
     class Solution {
     public ListNode middleNode(ListNode head) {
     ListNode slow = head, fast = head;
     while (fast != null && fast.next != null) {
     slow = slow.next;
     fast = fast.next.next;
     }
     return slow;
     }
     }

     https://leetcode-cn.com/problems/middle-of-the-linked-list/solution/lian-biao-de-zhong-jian-jie-dian-by-leetcode-solut/
     */

}