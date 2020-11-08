package 链表_分割链表_合并;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {3, 5, 8, 5, 10, 2, 1};
        ListNode list = util.createLinkedList(testArr);

        util.printLinkedList(solu.partition(list, 5));
    }
}