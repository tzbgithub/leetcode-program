package 链表_插入排序;
import  阿_模板包.util.*;
import  阿_模板包.util;
public class Test {
    public static void main(String args[]) {
        Solution solu = new Solution();
        int[] testArr = {6, 1, 2, 3, 4, 5};
        ListNode list1 = util.createLinkedList(testArr);
        ListNode list2 = util.createLinkedList(testArr);

//    System.out.println();
        util.printLinkedList(solu.insertionSortList(list1));
    }
}