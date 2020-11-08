package 链表_树_链表转平衡二叉树;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6};
        ListNode list = util.createLinkedList(testArr);
        solu.sortedListToBST(list);
        util.printLinkedList(list);
    }
}