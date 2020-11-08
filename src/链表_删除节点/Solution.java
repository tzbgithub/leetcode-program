package 链表_删除节点;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }
}
