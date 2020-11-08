package 链表_排序链表;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {1, 2, 3, 4, 5, 6, 0};
        ListNode list = util.createLinkedList(testArr);
//    System.out.println();
        util.printLinkedList(solu.sortList(list));

    }
}