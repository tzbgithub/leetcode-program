package 链表_返回中间结点;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list = util.createLinkedList(testArr);

        util.printLinkedList(solu.middleNode(list));
    }
}