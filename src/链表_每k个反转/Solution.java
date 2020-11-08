package 链表_每k个反转;

import 阿_模板包.util;
import 阿_模板包.util.ListNode;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //计算长度
        ListNode cur = dummy;
        ListNode pre = cur;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        cur = dummy;

        for (int i = 0; i < len / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                ListNode temp = cur.next;
                cur.next = temp.next;
                temp.next = cur;
                pre.next = temp;

            }
            //pre进行更新
            pre = cur;
            cur = pre.next;
        }
        return dummy.next;
    }
}

class Test {
    public static void main(String[] args) {
        ListNode list = util.createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode node = new Solution().reverseKGroup(list, 2);
        util.printLinkedList(node);
    }
}